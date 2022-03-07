# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int minElement(int arr[]){
        Arrays.sort(arr);
        return arr[1-1];
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        System.out.print(minElement(arr));
    }
}
