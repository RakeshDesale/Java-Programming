# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,j,sum=0,factors;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            factors=0;
            for(j=1;j<=arr[i];j++){
                if(arr[i]%j==0)
                    factors++;
            }
            if(factors==2)
                sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
