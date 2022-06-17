# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), arr[] = new int[n],i = 0,len;
        boolean flag = true;
        while(n != 0){
            arr[i++] = n % 10;
            n = n / 10;
        }
        len = arr.length;
        Arrays.sort(arr);
        for(i = 0;i < len - 1;i++){
            if(Math.abs(arr[i] - arr[i+1])>2){
                flag = false;
                break;
            }
        }
        System.out.println(flag?"Yes":"No");
    }
}
