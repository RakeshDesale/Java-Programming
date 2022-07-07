# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void minEle(int arr[][]){
        int i, j, min;
        for(i = 0; i < 3; i++){
            min = arr[i][0];
            for(j = 0; j < 3; j++){
                if(min > arr[i][j])
                    min = arr[i][j];
            }
            System.out.println(min);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        minEle(arr);
    }
}
