# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[][] interchangeDiagonal(int arr[][]){
        int i, j, temp;
        for(i = 0; i < 3; i++){
            temp = arr[i][i];
            arr[i][i] = arr[i][3 - i - 1];
            arr[i][3 - i - 1] = temp;
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
        arr = interchangeDiagonal(arr);
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
