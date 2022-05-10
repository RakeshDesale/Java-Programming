# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),a[] = new int[n],i,sum=0;
        for(i=0;i<n;i++)
            a[i] = obj.nextInt();
        for(i=0;i<n;i++)
            sum = sum + (a[i] * (a[i]+1));
        System.out.println(sum);
    }
}
