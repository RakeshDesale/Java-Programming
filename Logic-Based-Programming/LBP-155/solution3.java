# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int kShortExeTime(int arr[], int k){
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,k = obj.nextInt(),arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(kShortExeTime(arr,k));
    }
}