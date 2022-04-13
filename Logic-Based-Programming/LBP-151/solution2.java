# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int sumOfDistance(int arr[], int n){
        int i,sum = 0;
        for(i=0;i<n-1;i++)
            sum = sum + Math.abs(arr[i] - arr[i+1]);
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), i, arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(sumOfDistance(arr,n));
    }
}
