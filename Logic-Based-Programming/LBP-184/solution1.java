# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), arr[] = new int[n], b[] = new int[n],i,j,temp,count=0;
        for(i=0;i<n;i++){
            arr[i] = obj.nextInt();
            b[i] = arr[i];
        }
        Arrays.sort(arr);
        for(i=0;i<n;i++){
            if(arr[i] == b[i])
                count++;
        }
        System.out.println(count);
    }
}
