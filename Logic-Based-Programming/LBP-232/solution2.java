# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[][] swapRows(int arr[][], int m, int n){
        int i, j, temp;
        for(i = 0; i < 3; i++){
            temp = arr[m - 1][i];
            arr[m - 1][i] = arr[n - 1][i];
            arr[n - 1][i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j, m, n;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        m = obj.nextInt(); n = obj.nextInt();
        arr = swapRows(arr, m, n);
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
