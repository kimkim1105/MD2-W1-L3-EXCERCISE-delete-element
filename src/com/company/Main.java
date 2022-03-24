package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] array = {10, 4, 6, 7, 8, 6, 10, 0};
        System.out.println("In ra Mang: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
//        int indexDel = -1;
        int size = sizeArray(array, num);

        int cnt =0;
        int[] newArray = new int[array.length - size];
        System.out.println("size mang moiw"+newArray.length);

        for (int i = 0; i < array.length; i++) {
            if(cnt<= newArray.length){
                if (array[i]!=num){
                    newArray[cnt]=array[i];
                    cnt++;
                }else {
                    continue;
                }
            }

        }
        for (int item:
             newArray) {
            System.out.print(item+"\t");
        }

    }
        public static int sizeArray ( int[] array, int num){
            int size = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    size++;
                }
            }
            return size;
        }
    }