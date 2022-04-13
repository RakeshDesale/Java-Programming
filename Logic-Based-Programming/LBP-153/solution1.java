# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,j,count=0,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            for(j=1;j<=arr[i];j++){
                if (j*j==arr[i])
                    count++;
            }
        }
        System.out.println(count);
    }
}
