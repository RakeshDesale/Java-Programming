# Another Approach

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void alternateEvenOdd(int arr[], int n){
        int i,j,k,temp,even[] = new int[n/2],odd[] = new int[n/2];
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                }
            }
        }
        j = 0;
        k = 0;
        for(i=0;i<n;i++){
            if(arr[i]%2 == 0)
                even[j++] = arr[i];
            else
                odd[k++] = arr[i];
        }
        for(i=0;i<n/2;i++)
            System.out.print(even[i]+" "+odd[i]+" ");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        alternateEvenOdd(arr,n);
    }
}
