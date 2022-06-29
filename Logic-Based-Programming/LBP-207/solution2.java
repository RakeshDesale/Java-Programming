# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void matrixColSum(int arr[][]){
        int i,j,sum;
        for(i=0;i<3;i++){
            sum = 0;
            for(j=0;j<3;j++)
                sum = sum + arr[j][i];
            System.out.println(sum);
        }        
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3],i,j;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++)
                arr[i][j] = obj.nextInt();
        }
        matrixColSum(arr);
    }
}
