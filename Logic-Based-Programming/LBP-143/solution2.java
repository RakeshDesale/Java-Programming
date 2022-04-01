# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), m = obj.nextInt(),i,j=0;
        if(n>m)
            System.out.println(n);
        else{
            int arr[] = new int[m-n+1];
            for(i=n;i<=m;i++)
                arr[j++] = i;
            for(i=0;i<j;i++)
                System.out.print(arr[i]+" ");
        }
    }
}
