# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j, count = 0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(arr[i][j] == 0)
                    count++;
            }
        }
        System.out.println((count >= 5) ? "Yes" : "No");
    }
}
