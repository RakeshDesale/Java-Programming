# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,a[] = new int[n],b[] = new int[n];
        for(i=0;i<n;i++)
            a[i] = obj.nextInt();
        for(i=0;i<n;i++)
            b[i] = obj.nextInt();
        for(i=0;i<n;i++)
            System.out.print((a[i] - b[i])+" ");
    }
}
