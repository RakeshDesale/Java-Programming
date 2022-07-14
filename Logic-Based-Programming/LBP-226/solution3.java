# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[][] sortEleDesc(int arr[][]){
        int b[] = new int[10], i, j, k=0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                b[k++] = arr[i][j];
        }
        Arrays.sort(b);
        k = 9;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = b[k--];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        arr = sortEleDesc(arr);
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
