# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.print(arr[1]+" ");
        for(i=1;i<n-1;i++)
            System.out.print((arr[i-1]*arr[i+1])+" ");
        System.out.print(arr[n-2]);
    }
}
