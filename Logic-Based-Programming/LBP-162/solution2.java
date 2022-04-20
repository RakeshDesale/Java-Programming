# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int contains(int n){
        int count = 0;
        while(n!=0){
            if(n%10 == 5)
                count++;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),arr[] = new int[n],i,x,count = 0,splc = 0,ele=0;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            x = contains(arr[i]);
            if(count <= x){
                count = x;
                ele = arr[i];
            }
            if(x == 0)
                splc++;
        }
        System.out.println((splc != n)?ele:arr[0]);
    }
}
