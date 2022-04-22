# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean arrPali(int arr[], int n){
        int low,high;
        boolean flag = true;
        low = 0;
        high = n-1;
        while(low<=high){
            if(arr[low] != arr[high]){
                flag = false;
                break;
            }
            low++;
            high--;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n],low,high;
        boolean flag = true;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(arrPali(arr,n));
    }
}
