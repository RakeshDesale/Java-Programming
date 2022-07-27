# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isMatLT(int arr[][]){
        boolean flag = true;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(j > i && arr[i][j] != 0){
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
        System.out.println(isMatLT(arr) ? "Yes" : "No");
    }
}
