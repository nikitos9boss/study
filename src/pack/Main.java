package pack;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
      System.out.print(" capacity => ");
      int capacity = sc.nextInt();
      System.out.print(" size => ");
      int size = sc.nextInt();
      StackOrQueue();
      int StackOrQueue = sc.nextInt();
      if (StackOrQueue == 1){
          Stack stack = new Stack(capacity,size);
          workWithStack(stack);
      }else if( StackOrQueue == 2){
          Queue queue = new Queue(capacity,size);
          workWithQueue(queue);
      }else if (StackOrQueue == 0){
          System.out.println("bye from the main menu =)=)");
      }
    }
    public static void StackOrQueue(){
        System.out.println("1 - stack");
        System.out.println("2 - queue");
        System.out.println("0 - exit");
        System.out.print("=> ");
    }
    public static void menuQueue(){
        System.out.println("1 - enqueue");
        System.out.println("2 - dequeue");
        System.out.println("3 - print Queue ");
        System.out.println("0 - exit");
        System.out.print("=> ");
    }
    public static void workWithQueue(Queue queue){
        while (true) {
            menuQueue();
            int menu = sc.nextInt();
            switch (menu){
                case 1:{queue.enqueue();
                    queue.printArray(queue.getNumbers());
                    break;
                }
                case 2:{
                    System.out.println("head element is => "+queue.dequeue());
                    queue.printArray(queue.getNumbers());
                    break;
                }
                case 3:{
                    queue.printArray(queue.getNumbers());
                    break;
                }
                case 0:{
                    System.out.println("Queue bye =)");return;
                }
            }
        }
    }
    public static void menuStack(){
        System.out.println("1 - push");
        System.out.println("2 - pop");
        System.out.println("3 - print Stack");
        System.out.println("0 - exit");
        System.out.print("=> ");
    }
    public static void workWithStack(Stack stack){
        while (true) {
            menuStack();
            int menu = sc.nextInt();
            switch (menu){
                case 1:{stack.push();
                    stack.printArray(stack.getNumbers());
                    break;
                }
                case 2:{
                    System.out.println("upper element is => "+stack.pop());
                    stack.printArray(stack.getNumbers());
                    break;
                }
                case 3:{
                    stack.printArray(stack.getNumbers());
                    break;
                }
                case 0:{
                    System.out.println("Stack bye =)");return;
                }
            }
        }
    }
}
