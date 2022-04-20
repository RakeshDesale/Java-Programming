# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int uniqueNumber(int arr[], int n){
        int i,j,count;
        for(i=0;i<n;i++){
            count = 0;
            for(j=0;j<n;j++){
                if(i != j && arr[i] == arr[j])
                    count++;
            }
            if(count == 0)
                return arr[i];
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), arr[] = new int[n], i, j, count;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.println(uniqueNumber(arr,n));
    }
}
