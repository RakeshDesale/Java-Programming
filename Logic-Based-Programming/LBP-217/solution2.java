# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void transposeMatrix(int arr[][]){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(arr[j][i]+" ");
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
        transposeMatrix(arr);
    }
}
