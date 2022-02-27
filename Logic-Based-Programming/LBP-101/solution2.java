# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void printArray(int arr[],int n){
        for(int i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i]=obj.nextInt();
        printArray(arr,n);
    }
}
