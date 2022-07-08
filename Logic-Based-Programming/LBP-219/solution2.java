# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void oddEvenFreq(int arr[][]){
        int i, j, oddcount = 0, evencount = 0;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                if(arr[i][j] % 2 == 0 && arr[i][j] != 0)
                    evencount++;
                else if(arr[i][j] % 2 != 0 && arr[i][j] != 0)
                    oddcount++;
            }
        }
        System.out.println(oddcount+"\n"+evencount);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[][] = new int[3][3], i, j;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++)
                arr[i][j] = obj.nextInt();
        }
        oddEvenFreq(arr);
    }
}
