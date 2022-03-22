# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int duplicateElements(int arr[], int n){
        int b[] = new int[999],count=0,i;
        for(i=0;i<n;i++)
            b[arr[i]]++;
        for(i=0;i<999;i++){
            if(b[i]>=2)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(duplicateElements(arr,n));
    }
}
