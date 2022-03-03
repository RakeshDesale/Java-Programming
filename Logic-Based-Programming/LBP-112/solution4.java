# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int searchElement(int arr[], int n, int key){
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,key);
        if (index<0)
            return -1;
        else
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
