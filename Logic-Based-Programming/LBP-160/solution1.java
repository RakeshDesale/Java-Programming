# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean shareOneDigit(int d, int n){
        while(n!=0){
            if(n%10==d)
                return true;
            n = n/10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n],count=0;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n-1;i++){
            while(arr[i]!=0){
                if(shareOneDigit(arr[i]%10,arr[i+1])){
                    count++;
                    break;
                }
                arr[i] = arr[i]/10;
            }
        }
        System.out.println(count==n-1);
    }
}
