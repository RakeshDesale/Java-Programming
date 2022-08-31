# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int isPrimeCount(int n){
        int d, count = 0;
        while(n != 0){
            d = n % 10;
            if(d == 2 || d == 3 || d == 5 || d == 7)
                count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j, count = 0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                count = count + isPrimeCount(arr[i][j]);
        }
        System.out.println(count);
    }
}

