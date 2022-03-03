# Using Binary Search and Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int searchElement(int arr[], int n, int key){
        int i,j,temp,index=-1,low,mid,high;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        low = 0;
        high = n-1;
        while(low <= high){
            mid = (low+high)/2;
            if(key == arr[mid]){
                index = mid;
                break;
            }
            else if(key > arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        int key = obj.nextInt();
        System.out.println(searchElement(arr,n,key));
    }
}
