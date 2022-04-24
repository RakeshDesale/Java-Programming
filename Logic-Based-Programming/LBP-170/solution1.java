# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt(), n = obj.nextInt(), i, j,arr[][] = new int[m][n];
        for(i=0;i<m;i++){
            for(j=0;j<n;j++)
                arr[i][j] = obj.nextInt();
        }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++)
                System.out.print(arr[i][j]+" ");
        }
    }
}
