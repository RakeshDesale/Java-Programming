# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void indexSum(int arr[], int n){
        int low = 0, high = n-1;
        while(low <= high){
            System.out.print((arr[low]+arr[high])+" ");
            low++;
            high--;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        indexSum(arr,n);
    }
}
