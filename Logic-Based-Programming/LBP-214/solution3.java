# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int minEle(int arr[][]){
        int i, j, min;
        min = arr[0][0];
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(min > arr[i][j])
                    min = arr[i][j];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        System.out.println(minEle(arr));
    }
}
