# Using Function and Using Core Logic

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int kShortExeTime(int arr[], int n, int k){
        int i,j,temp;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[k-1];
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), k = obj.nextInt(), arr[] = new int[n], i;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(kShortExeTime(arr,n,k));
    }
}
