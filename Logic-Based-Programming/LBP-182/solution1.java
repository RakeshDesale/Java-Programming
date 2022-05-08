# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),arr[] = new int[n],i,j,factors,min = 999,max = -1;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        Arrays.sort(arr);
        for(i=0;i<n;i++){
            factors = 0;
            for(j=1;j<=arr[i];j++){
                if(arr[i]%j == 0)
                    factors++;
            }
            if(factors == 2){
                if(min>arr[i])
                    min = arr[i];
                if(max<arr[i])
                    max = arr[i];
            }
        }
        if(max!=-1 && min!=999)
            System.out.println(max-min);
        else
            System.out.println(0);
    }
}
