# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] sortArr(int arr[], int n){
        int i,j,temp;
        for(i=0;i<n/2;i++){
            for(j=i+1;j<n/2;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
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
