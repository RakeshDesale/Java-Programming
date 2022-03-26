# Using Function and Using Arrays Sort Method

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] sortArr(int arr[], int n){
        Arrays.sort(arr,0,n/2);
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        arr = sortArr(arr,n);
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
