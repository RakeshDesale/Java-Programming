# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int maxChar(String str){
        int a[]=new int[256],i,max=0;
        for(i=0;i<str.length();i++)
            a[(int)str.charAt(i)]++;
        for(i=0;i<256;i++){
            if(a[i]>a[max])
                max=i;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        System.out.println((char)maxChar(s));
    }
}
