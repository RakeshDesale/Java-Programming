# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), arr[] = new int[n], i, j, temp;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        Arrays.sort(arr);
        for(i=0;i<n/2;i++)
            System.out.print(arr[i]+" ");
        for(i=n-1;i>=n/2;i--)
            System.out.print(arr[i]+" ");
    }
}
