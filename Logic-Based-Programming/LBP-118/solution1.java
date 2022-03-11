# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,count=0;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        int key = obj.nextInt();
        for(i=0;i<n;i++){
            if(arr[i] == key)
                count++;
        }
        System.out.println(count);
    }
}
