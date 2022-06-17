# Using Core Logic

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), arr[] = new int[n],i = 0,j,temp,len;
        boolean flag = true;
        while(n != 0){
            arr[i++] = n % 10;
            n = n / 10;
        }
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
        System.out.println(flag?"Yes":"No");
    }
}
