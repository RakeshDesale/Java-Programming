# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] updateElementOnPosition(int arr[], int n, int loc, int ele){
        arr[loc] = ele;
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),arr[] = new int[n],i;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        int loc = obj.nextInt();
        int ele = obj.nextInt();
        arr = updateElementOnPosition(arr,n,loc,ele);
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
