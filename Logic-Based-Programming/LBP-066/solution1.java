# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String repeatChar(String str){
        int len=str.length();
        char[] res= new char[len*2];
        int i,k=0;
        for(i=0;i<str.length();i++){
            res[k++]=str.charAt(i);
            res[k++]=str.charAt(i);
        }
        String str3=new String(res);
        return str3;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(repeatChar(obj.nextLine()));
    }
}
