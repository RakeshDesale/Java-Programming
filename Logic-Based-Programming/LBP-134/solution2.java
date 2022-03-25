# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int arrSum(int arr[],int n){
        int i,sum=0;
        for(i=0;i<n;i++){
            if(i%2==0)
                sum = sum + arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(arrSum(arr,n));
    }
}
