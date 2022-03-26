# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void countEvenOdd(int arr[],int n){
        int count[] = new int [2],i,countEven = 0,countOdd = 0;
        for(i=0;i<n;i++){
            if(arr[i]%2==0)
                countEven++;
            else
                countOdd++;
        }
        System.out.println(countEven+"\n"+countOdd);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        countEvenOdd(arr,n);
    }
}
