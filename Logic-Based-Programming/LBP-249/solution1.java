# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j, d, r, temp;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                temp = arr[i][j];
                r = 0;
                while(temp != 0){
                    d = temp % 10;
                    r = r * 10 + d;
                    temp = temp / 10;
                }
                System.out.print(r + " ");
            }
            System.out.println();
        }
    }
}
