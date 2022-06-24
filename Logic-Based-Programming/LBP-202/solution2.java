# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int matrixSum(int arr[][], int n, int m){
        int i, j, sum=0;
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++)
                sum = sum + arr[i][j];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), m = obj.nextInt(), i, j, arr[][] = new int[n][m];
        if((n >= 1 && n <= 5) && (m >= 1 && m <= 5)){
            for(i = 0; i < n; i++){
                for(j = 0; j < m; j++)
                    arr[i][j] = obj.nextInt();
            }
            System.out.println(matrixSum(arr, n, m));
        }
        else
            System.exit(0);
    }
}
