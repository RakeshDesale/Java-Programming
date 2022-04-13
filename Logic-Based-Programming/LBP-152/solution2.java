# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void oddAfterEven(int arr[], int n){
        int i;
        for(i=0;i<n;i++){
            if(arr[i]%2==0)
                System.out.print(arr[i]+" ");
        }
        for(i=0;i<n;i++){
            if(arr[i]%2!=0)
                System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        oddAfterEven(arr,n);
    }
}
