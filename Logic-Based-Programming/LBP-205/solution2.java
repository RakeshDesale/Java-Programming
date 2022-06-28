# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPrime(int n){
        int i, factors = 0;
        for(i = 1; i <= n; i++){
            if(n % i == 0)
                factors++;
        }
        return factors == 2;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j, sum = 0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(isPrime(arr[i][j]))
                    sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
