# Another Approach Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[][] subMatrix(int a[][], int b[][]){
        int i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                a[i][j] = a[i][j] - b[i][j];
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[][] = new int[3][3], b[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                a[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                b[i][j] = obj.nextInt();
        }
        a = subMatrix(a, b);
        for(i =0 ; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
