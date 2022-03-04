# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int maxElement(int arr[],int n){
        Arrays.sort(arr);
        return arr[n-1];
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(maxElement(arr,n));
    }
}
