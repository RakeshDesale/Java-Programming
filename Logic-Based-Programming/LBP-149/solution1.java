# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=1;i<n-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                System.out.print(arr[i]+" ");
        }
    }
}
