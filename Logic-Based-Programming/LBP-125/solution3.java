# Another Approach Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int[] updateElement(int arr[], int n, int oldele, int newele){
        int i;
        for(i=0;i<n;i++){
            if(arr[i] == oldele)
                arr[i] = newele;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        int oldele = obj.nextInt(), newele = obj.nextInt();
        arr = updateElement(arr,n,oldele,newele);
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");

    }
}
