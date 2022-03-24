# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] replaceArrEle(int arr[],int n){
        int i,j,max;
        for(i=0;i<n-1;i++){
            max = arr[i];
            for(j=i+1;j<n;j++){
                if(max<arr[j])
                    max = arr[j];
            }
            arr[i] = max;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        arr = replaceArrEle(arr,n);
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
