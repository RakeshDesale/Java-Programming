# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean allParamTrue(int arr[], int n){
        boolean flag = true;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
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
        System.out.println(allParamTrue(arr,n));
    }
}
