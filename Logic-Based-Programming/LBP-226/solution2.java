# Using Core Logic

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j, temp, k = 0, b[] = new int[9];
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                b[k++] = arr[i][j];
        }
        for(i = 0; i < k; i++){
            for(j = i + 1; j < k; j++){
                if(b[i] < b[j]){
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        k = 0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = b[k++];
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
