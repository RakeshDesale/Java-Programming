# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),sd = obj.nextInt(),ed = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            if(Math.abs(arr[i])>=sd && Math.abs(arr[i])<=ed)
                System.out.print(arr[i]+" ");
        }
    }
}
