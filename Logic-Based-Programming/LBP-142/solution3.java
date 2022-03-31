# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] multipleArr(int arr[], int m, int n){
        int i;
        for(i=1;i<=n;i++)
            arr[i] = m*i;
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt(), n = obj.nextInt(), arr[] = new int[n+1],i;
        arr = multipleArr(arr,m,n);
        for(i=1;i<=n;i++)
            System.out.print(arr[i]+" ");
    }
}
