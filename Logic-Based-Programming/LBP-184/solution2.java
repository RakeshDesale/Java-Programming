# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int countUnchanged(int arr[], int b[], int n){
        int i,count=0;
        Arrays.sort(arr);
        for(i=0;i<n;i++){
            if(arr[i] == b[i])
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), arr[] = new int[n], b[] = new int[n],i;
        for(i=0;i<n;i++){
            arr[i] = obj.nextInt();
            b[i] = arr[i];
        }
        System.out.println(countUnchanged(arr,b,n));
    }
}
