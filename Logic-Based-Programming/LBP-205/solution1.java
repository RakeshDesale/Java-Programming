# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j, k, factors, sum = 0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                factors = 0;
                for(k = 1; k <= arr[i][j]; k++){
                    if(arr[i][j] % k == 0)
                        factors++;
                }
                if(factors == 2)
                    sum = sum + arr[i][j];
            }
        }
        System.out.println(sum);
    }
}
