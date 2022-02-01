# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int i,n=str.length();
        int arr[]=new int[n];
        char shstr[]=new char[n];
        for (i=0;i<n;i++)
            arr[i]=obj.nextInt();
        for(i=0;i<n;i++)
            shstr[arr[i]]=str.charAt(i);
        System.out.println(shstr);
    }
}
