package com.dsa.searching;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = {1,2,3,4,5,6,7,8,9,1,4,22,64,32,67,34,87,27,58,96,32,19,29};
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the Element you want to search : ");
        int target = in.nextInt();
        int index = location(a, target);
        if(index != -1){
            System.out.println("Element found in "+(index)+" position" );
        }else System.out.println("Element not found");
    }

    public static int location(int []a,int target){
        int start = 0;
        int end = a.length-1;

        while (start <= end){

            int mid = (start + end) / 2;  // (or) start + (end - start) / 2  both are same

            if(mid == target){
                return mid;
            }
            if(target > mid){
                start = mid+1;
            } else if (target < mid) {
                end = mid-1;
            }
        }
        return -1;
    }
}
