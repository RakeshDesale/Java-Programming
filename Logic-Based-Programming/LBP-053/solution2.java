# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String shuffledString(String str, int[] arr,int n){
        char shstr[]=new char[n];
        int i;
        for(i=0;i<n;i++)
            shstr[arr[i]]=str.charAt(i);
        String string=new String(shstr);
        return string;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int i,n=str.length();
        int arr[]=new int[n];
        for (i=0;i<n;i++)
            arr[i]=obj.nextInt();
        System.out.println(shuffledString(str,arr,n));
    }
}
