# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean symmetricMat(int arr[][]){
        int b[][] = new int[3][3], i, j;
        boolean flag = true;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                b[i][j] = arr[j][i];
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(arr[i][j] != b[i][j]){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        System.out.println(symmetricMat(arr) ? "Yes" : "No");
    }
}
