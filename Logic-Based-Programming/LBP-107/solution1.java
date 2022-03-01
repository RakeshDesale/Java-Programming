# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,j,fact,factsum,strongsum=0,temp,d;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            temp = arr[i];
            factsum=0;
            while(temp!=0){
                fact=1;
                d = temp%10;
                for(j=1;j<=d;j++)
                    fact = fact*j;
                factsum = factsum+fact;
                temp = temp/10;
            }
            if(arr[i]==factsum)
                strongsum = strongsum+arr[i];
        }
        System.out.println(strongsum);
    }
}
