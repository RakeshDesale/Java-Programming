# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPalindrome(int n){
        int d,rev=0,temp=n;
        while(n!=0){
            d = n%10;
            rev = rev*10+d;
            n = n/10;
        }
        return temp==rev;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,sum=0;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            if(isPalindrome(arr[i]))
                sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
