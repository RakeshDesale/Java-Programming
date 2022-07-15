# Using Function and Using Core Logic

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[][] sortRowEleDesc(int arr[][]){
        int i, j, k, temp;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                for(k = j + 1; k < 3; k++){
                    if(arr[i][j] < arr[i][k]){
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
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
        arr = sortRowEleDesc(arr);
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
