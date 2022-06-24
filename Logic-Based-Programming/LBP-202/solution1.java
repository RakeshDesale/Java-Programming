# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), m = obj.nextInt(), i, j, arr[][] = new int[n][m], sum=0;
        if((n >= 1 && n <= 5) && (m >= 1 && m <= 5)){
            for(i = 0; i < n; i++){
                for(j = 0; j < m; j++)
                    arr[i][j] = obj.nextInt();
            }
            for(i = 0; i < n; i++){
                for(j = 0; j < m; j++)
                    sum = sum + arr[i][j];
            }
            System.out.println(sum);
        }
        else
            System.exit(0);
    }
}
