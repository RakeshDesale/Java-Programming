# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean identityMatrix(int arr[][]){
        int i, j;
        boolean flag = true;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(i == j && arr[i][j] != 1){
                    flag = false;
                    break;
                }
                if(i != j && arr[i][j] != 0){
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int i, j, arr[][] = new int[3][3];
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        System.out.print((identityMatrix(arr))?"Yes":"No");
    }
}
