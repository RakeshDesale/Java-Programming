# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[][] sortRowEle(int arr[][]){
        for(int i = 0; i < 3; i++)
                Arrays.sort(arr[i]);
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        arr = sortRowEle(arr);
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
