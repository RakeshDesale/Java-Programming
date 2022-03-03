# Traditional Approach Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int searchElement(int arr[], int n, int key){
        int i,j,temp,index=-1;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i=0;i<n;i++){
            if(arr[i] == key){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,key;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        key = obj.nextInt();
        System.out.println(searchElement(arr,n,key));
    }
}
