# Using Arrays Sort Approach

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        Arrays.sort(arr,0,n/2);
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
