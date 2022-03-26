# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,d,rev=0,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            rev=0;
            while(arr[i]!=0){
                d = arr[i]%10;
                rev = rev*10+d;
                arr[i] = arr[i]/10;
            }
            System.out.print(rev+" ");
        }
    }
}
