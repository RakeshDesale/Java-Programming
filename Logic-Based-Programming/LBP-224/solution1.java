# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[][] = new int[3][3], b[][] = new int[3][3], c[][] = new int[3][3], i, j, k;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                a[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                b[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                c[i][j] = 0;
                for(k = 0; k < 3; k++)
                    c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
            }
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(c[i][j] + " ");
            System.out.println();
        }
    }
}
