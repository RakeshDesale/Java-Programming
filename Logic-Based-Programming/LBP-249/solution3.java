# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int rev(int n){
        int d, r = 0;
        while(n != 0){
            d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                System.out.print(rev(arr[i][j]) + " ");
            }
            System.out.println();
        }
    }
}

