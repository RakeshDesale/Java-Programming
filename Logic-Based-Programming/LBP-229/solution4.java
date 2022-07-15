# Using Function and Using Core Logic

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[][] sortColEle(int a[][]){
        int b[][] = new int[3][3], i, j, k, temp;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                b[i][j] = a[j][i];
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                for(k = j + 1; k < 3; k++){
                    if(b[i][j] > b[i][k]){
                        temp = b[i][j];
                        b[i][j] = b[i][k];
                        b[i][k] = temp;
                    }
                }
            }
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                a[i][j] = obj.nextInt();
        }
        a = sortColEle(a);
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(a[j][i] + " ");
            System.out.println();
        }
    }
}
