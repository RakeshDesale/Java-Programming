# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j, max;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        max = arr[0][0];
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(max < arr[i][j])
                    max = arr[i][j];
            }
        }
        System.out.println(max);
    }
}
