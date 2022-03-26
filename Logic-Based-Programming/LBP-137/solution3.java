# Using Function and Return Value

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int reverseArrEle(int n){
        int d,rev=0;
        while(n!=0){
            d = n%10;
            rev = rev*10+d;
            n = n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++)
            System.out.print(reverseArrEle(arr[i])+" ");
    }
}
