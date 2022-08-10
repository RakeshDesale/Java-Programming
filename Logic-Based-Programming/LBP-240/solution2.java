# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void printSqr(int arr[][]){
        int i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(arr[i][j] * arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        printSqr(arr);
    }
}