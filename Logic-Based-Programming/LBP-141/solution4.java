# Using Function and Non Return Value

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void rearrangeArr(int arr[], int n){
        int i,j,temp,low,high;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        low = 0;
        high = n-1;
        while(low <= high){
            System.out.print(arr[low]+" "+arr[high]+" ");
            low++;
            high--;
        }        
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        rearrangeArr(arr,n);
    }
}
