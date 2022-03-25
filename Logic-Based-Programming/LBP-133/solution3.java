# Another Approach Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void arrSum(int a[], int b[], int n){
        int i;
        for(i=0;i<n;i++)
            System.out.print((a[i]+b[i])+" ");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,a[] = new int[n],b[] = new int[n];
        for(i=0;i<n;i++)
            a[i] = obj.nextInt();
        for(i=0;i<n;i++)
            b[i] = obj.nextInt();
        arrSum(a,b,n);
    }
}
