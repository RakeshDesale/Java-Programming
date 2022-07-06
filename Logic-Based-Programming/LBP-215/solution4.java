# Traditional Approach Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void maxEle(int arr[][]){
        int i, j, k, temp;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                for(k = j + 1; k < 3; k++){
                    if(arr[i][j] > arr[i][k]){
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
                }
            }
            System.out.println(arr[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        maxEle(arr);
    }
}
