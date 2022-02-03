package pack;

import java.util.Scanner;

public class Stack {
    private int capacity;
    private int size;
    private int[] numbers;
    private Scanner sc = new Scanner(System.in);
    public Stack(int capacity, int size){
        this.capacity = capacity;
        this.size = size;
        numbers = new int[capacity];
        if (capacity > 0 && size > 0){
            while (true){
                System.out.println("1 - fill rand");
                System.out.println("2 - fill by hand");
                int menu = sc.nextInt();
                if (menu == 1 || menu == 2 ){
                    fillArray(menu);
                    break;
                }
            }
        }
    }
    void push(){
        if(size <= capacity){
            if (size == capacity){
                copyArray();
            }
            System.out.print("numbers["+size+"] =>");
            numbers[size] = sc.nextInt();
            size ++;
        }else System.out.println("size >capacity");
    }
    int pop(){
        int buffer =0;
        if (size > 0){
            buffer = numbers[size-1];
            numbers[size-1] = 0;
            size--;
        }else {
            System.out.println("size equals  0");
        }
        return buffer;
    }
    int []getNumbers(){
        return numbers;
    }
     void copyArray(){
        int[] buff = new int[capacity*2];
        for (int i = 0; i < capacity; i++) {
                buff[i] = numbers[i];
        }
        capacity = capacity*2;
        numbers = new int[capacity];
         for (int i = 0; i < capacity; i++) {
             numbers[i] = buff[i];
         }
    }
    void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("[%d]",i);
        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("%-3d",numbers[i]);
        }
        System.out.println();
    }
    void fillArray(int menu){
        if (menu == 1){
            for (int i = 0; i < size; i++) {
                numbers[i] = (int)(Math.random()*10);
            }
        }else{
            for (int i = 0; i < size; i++) {
                System.out.println("numbers["+numbers[i]+"]");
                numbers[i] = sc.nextInt();
            }
        }
    }
}
