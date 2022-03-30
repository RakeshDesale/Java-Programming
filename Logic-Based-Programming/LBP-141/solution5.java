# Using Function and Return Value

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] rearrangeArr(int arr[], int n){
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
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,low,high,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        arr = rearrangeArr(arr,n);
        low = 0;
        high = n-1;
        while(low <= high){
            System.out.print(arr[low]+" "+arr[high]+" ");
            low++;
            high--;
        }
    }
}
