# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean alternatePositiveNegative(int arr[], int n){
        boolean flag = true;
        for(int i=0;i<n-1;i++){
            if((arr[i]>0 && arr[i+1]>0) || (arr[i]<0 && arr[i+1]<0)){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        boolean flag = true;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(alternatePositiveNegative(arr,n));
    }
}
