# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), m = (int)Math.sqrt(n),i,j,k=0, arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<m;i++){
            for(j=0;j<m;j++)
                System.out.print(arr[k++]+" ");
            System.out.println();
        }
    }
}
