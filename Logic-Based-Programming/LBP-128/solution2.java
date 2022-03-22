# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void incArrEle(int arr[], int n){
        int i;
        for(i=0;i<n;i++)
            System.out.print(arr[i]+1+" ");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        incArrEle(arr,n);
    }
}
