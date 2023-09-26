package com.dsa.sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int a[] = {7,9,3,6,2,1,3,4,5,0};
        bubble(a);
        System.out.println(Arrays.toString(bubble2(a)));
    }

     static void bubble(int[] a){
        for (int i = 0; i <a.length; i++) {
            for (int j =i + 1; j <a.length; j++) {
                if(a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    static int[] bubble2(int[] b){
        for (int i = 0; i <b.length; i++) {
            for (int j =1; j <b.length-i; j++) {
                if(b[j] < b[j-1]) {
                    int temp = b[j];
                    b[j] = b[j-1];
                    b[j-1] = temp;
                }
            }
        }
        return b;
    }
}
