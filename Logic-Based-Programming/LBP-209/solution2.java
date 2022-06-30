# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int sumOppDiagonal(int arr[][]){
        int i, sum = 0;
        for(i = 0; i < 3; i++)
            sum = sum + arr[i][3 - i - 1];        
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j, sum = 0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        System.out.println(sumOppDiagonal(arr));
    }
}
