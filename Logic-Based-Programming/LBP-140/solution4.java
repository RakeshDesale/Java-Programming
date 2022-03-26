# Using Function and Return Value

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] arrDiff(int a[], int b[], int n){
        int i;
        for(i=0;i<n;i++)
            a[i] = a[i] - b[i];
        return a;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,a[] = new int[n],b[] = new int[n];
        for(i=0;i<n;i++)
            a[i] = obj.nextInt();
        for(i=0;i<n;i++)
            b[i] = obj.nextInt();
        a=arrDiff(a,b,n);
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
