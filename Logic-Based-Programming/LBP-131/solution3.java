# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] arrSort(int arr[]){
        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        arr=arrSort(arr);
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
