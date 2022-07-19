# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean countZero(int arr[][]){
        int i, j, count = 0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(arr[i][j] == 0)
                    count++;
            }
        }
        return count >= 5;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        System.out.println(countZero(arr) ? "Yes" : "No");
    }
}
