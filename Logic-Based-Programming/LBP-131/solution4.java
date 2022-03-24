# Another Approach Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] arrSort(int arr[],int n){
        int i,j,temp;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        arr=arrSort(arr,n);
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
