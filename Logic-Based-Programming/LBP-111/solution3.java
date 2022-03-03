# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] sortArrDesc(int arr[]){
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        arr=sortArrDesc(arr);
        for(i=n-1;i>=0;i--)
            System.out.print(arr[i]+" ");
    }
}
