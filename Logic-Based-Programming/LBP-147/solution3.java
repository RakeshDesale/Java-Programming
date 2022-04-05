# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int lowest2Sum(int arr[], int n){
        int i,sum=0;
        Arrays.sort(arr);
        for(i=0;i<n;i++){
            if(arr[i]>0){
                sum = arr[i]+arr[i+1];
                break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(lowest2Sum(arr,n));
    }
}
