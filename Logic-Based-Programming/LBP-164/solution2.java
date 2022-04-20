# Using Function and No Return Type

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void mulPrevNext(int arr[], int n){
        System.out.print(arr[1]+" ");
        for(int i=1;i<n-1;i++)
            System.out.print((arr[i-1]*arr[i+1])+" ");
        System.out.print(arr[n-2]);        
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        mulPrevNext(arr,n);
    }
}
