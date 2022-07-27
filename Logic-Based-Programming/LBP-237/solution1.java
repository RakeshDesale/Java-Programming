# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j, m;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        m = obj.nextInt();
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                System.out.print((arr[i][j] * m) + " ");
            System.out.println();
        }
    }
}
