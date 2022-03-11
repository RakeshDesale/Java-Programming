# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int secondMin(int arr[],int n){
        Arrays.sort(arr);
        return arr[2-1];
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(secondMin(arr,n));
    }
}
