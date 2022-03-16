# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        int oldele = obj.nextInt(),newele = obj.nextInt();
        for(i=0;i<n;i++){
            if(arr[i] == oldele)
                arr[i] = newele;
        }
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }
}
