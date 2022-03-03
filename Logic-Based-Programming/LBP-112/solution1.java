# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        int key = obj.nextInt();
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr,key);
        System.out.println((index<0)?-1:index);
    }
}
