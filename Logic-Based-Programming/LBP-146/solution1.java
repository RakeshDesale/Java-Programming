# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void countSum(int arr[], int n){
        int i,sum=0,count=0;
        for(i=0;i<n;i++){
            if(arr[i]>0)
                count++;
            else if(arr[i]==0)
                continue;
            else
                sum = sum + arr[i];
            }
            System.out.print(count+" "+sum);
        }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        if(n!=0)
            countSum(arr,n);
        else
            System.out.println(" ");
    }
}
