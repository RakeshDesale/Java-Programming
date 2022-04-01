# With Return Value

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] countSum(int arr[], int n){
        int i,sum=0,count=0,a[] = new int[2];
        for(i=0;i<n;i++){
            if(arr[i]>0)
                count++;
            else if(arr[i]==0)
                continue;
            else
                sum = sum + arr[i];
            }
        a[0] = count;
        a[1] = sum;
        return a;
        }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        if(n!=0){
            arr = countSum(arr,n);
            for(i=0;i<2;i++)
                System.out.print(arr[i]+" ");
        }
        else
            System.out.println(" ");
    }
}
