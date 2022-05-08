# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPrime(int n){
        int i,factors = 0;
        for(i=1;i<=n;i++){
            if(n%i == 0)
                factors++;
        }
        return factors == 2;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),arr[] = new int[n],i,min = 999,max = -1;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        Arrays.sort(arr);
        for(i=0;i<n;i++){
            if(isPrime(arr[i])){
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
