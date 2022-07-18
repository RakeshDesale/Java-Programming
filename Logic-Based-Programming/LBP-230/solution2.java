# Using Core Concept

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[][] = new int[3][3], b[][] = new int[3][3], i, j, k, temp;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                a[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                b[i][j] = a[j][i];
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                for(k = j + 1; k < 3; k++){
                    if(b[i][j] < b[i][k]){
                        temp = b[i][j];
                        b[i][j] = b[i][k];
                        b[i][k] = temp;
                    }
                }
            }
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(b[j][i] + " ");
            System.out.println();
        }
    }
}
