# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,j,factors,arr[] = new int[n],count=0;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            factors=0;
            for(j=1;j<=arr[i];j++){
                if(arr[i]%j==0)
                    factors++;
            }
            if(factors==2)
                count++;
        }
        System.out.println(count==n);
    }
}
