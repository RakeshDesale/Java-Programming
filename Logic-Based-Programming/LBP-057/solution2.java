# Using Core Concept

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String reversed(String str){
        char[] str1=new char[str.length()];
        int j=0;
        for(int i=str.length()-1;i>=0;i--){
            str1[j]=str.charAt(i);
            j++;
        }
        String str2=new String(str1);
        return str2;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(reversed(obj.nextLine()));
    }
}
