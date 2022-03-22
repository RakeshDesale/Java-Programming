# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,count=0,arr[] = new int[n],b[] = new int[999];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++)
            b[arr[i]]++;
        for(i=0;i<999;i++){
            if(b[i]>=2)
                count++;
        }
        System.out.println(count);
    }
}
