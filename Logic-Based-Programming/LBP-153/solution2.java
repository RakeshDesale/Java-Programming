# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int numberOfPlots(int arr[], int n){
        int i, j, count = 0;
        for(i=0;i<n;i++){
            for(j=1;j<=arr[i];j++){
                if(j*j==arr[i])
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(numberOfPlots(arr,n));
    }
}