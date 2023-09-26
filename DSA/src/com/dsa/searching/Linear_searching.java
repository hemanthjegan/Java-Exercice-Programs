package com.dsa.searching;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_searching {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8,9,1,4,22,64,32,67,34,87,27,58,96,32,19,29};
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the Element you want to search : ");
        int target = in.nextInt();
        int index = location(a, target);
        if(index != -1){
            System.out.println("Element found in "+(index+1)+" position" );
        }else System.out.println("Element not found");
    }

    public static int location(int []a, int target){
        int comparision = 0;
        for (int i = 0; i <a.length ; i++) {
            if(target == a[i]){
                comparision++;
                return i;
            }
        }
        return -1;
    }
}
