# Using Function and Using Core Logic

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isJackpot(int arr[]){
        int len,i,j,temp;
        boolean flag = true;
        len = arr.length;
        for(i = 0;i < len;i++){
            for(j = i + 1;j < len;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i = 0;i < len - 1;i++){
            if(Math.abs(arr[i] - arr[i+1])>2){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), arr[] = new int[n],i = 0;
        while(n != 0){
            arr[i++] = n % 10;
            n = n / 10;
        }
        System.out.println(isJackpot(arr)?"Yes":"No");
    }
}
