# Using Core Logic and Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] halfAscDesc(int arr[], int n){
        int i,j,temp;
        for(i = 0;i < n;i++){
            for(j = i + 1;j < n;j++){
                if(arr[i] > arr[j]){
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
        int n = obj.nextInt(), arr[] = new int[n], i;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        arr = halfAscDesc(arr,n);
        for(i = 0;i < n / 2;i++)
            System.out.print(arr[i]+" ");
        for(i = n - 1;i >= n / 2;i--)
            System.out.print(arr[i]+" ");
    }
}
