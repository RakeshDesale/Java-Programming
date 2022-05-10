# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int sumOfProd(int a[], int n){
        int i,sum = 0;
        for(i=0;i<n;i++)
            sum = sum + (a[i] * (a[i]+1));
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),a[] = new int[n],i;
        for(i=0;i<n;i++)
            a[i] = obj.nextInt();
        System.out.println(sumOfProd(a,n));
    }
}
