package main;

import main.Binary;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array;
        int length, findedNumber;
        System.out.println("Enter length of array for binary search and also array");
        System.out.println("length:");
        length = sc.nextInt();
        System.out.println("array:");
        array = new int[length];
        for (int i = 0; i<length; i++){
            array[i] = sc.nextInt();
        }
        Arrays.stream(array).sorted();
        for (int i = 0; i<length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("enter number what are you want to find?");
        findedNumber = sc.nextInt();
        System.out.println("index of this element is" + Binary.binarySearch(array, findedNumber));

    }
}