# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int diagonalProd(int arr[][]){
        int i, j, prod = 1;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(i == j)
                    prod = prod * arr[i][j];
            }
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        System.out.println(diagonalProd(arr));
    }
}
