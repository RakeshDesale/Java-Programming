# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++)
            Arrays.sort(arr[i]);
        for(i = 0; i < 3; i++){
            for(j = 3 - 1; j >= 0; j--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
