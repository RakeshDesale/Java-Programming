# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int factorial(int d){
        if(d==0)
            return 1;
        else
            return d*factorial(d-1);
    }
    
    static boolean isStrong(int n){
        int sum=0,d,temp=n;
        while(n!=0){
            d=n%10;
            sum = sum+factorial(d);
            n=n/10;
        }
        return (temp==sum);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,sum=0;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            if(isStrong(arr[i]))
                sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
