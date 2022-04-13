# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), i, sum = 0, arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n-1;i++)
            sum = sum + Math.abs(arr[i] - arr[i+1]);
        System.out.println(sum);
    }
}
