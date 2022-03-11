# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int eleCount(int arr[], int key, int n){
        int i,count=0;
        for(i=0;i<n;i++){
            if(arr[i]==key)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        int key = obj.nextInt();
        System.out.println(eleCount(arr,key,n));
   }
}
