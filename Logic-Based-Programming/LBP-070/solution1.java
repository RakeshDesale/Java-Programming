# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String spaceStr(String str){
        char s[] = new char[(str.length()*2)];
        int i,j=0;
        for(i=0;i<str.length();i++){
            s[j++]=str.charAt(i);
            s[j++]=' ';
        }
        String sb = new String(s);
        return sb;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(spaceStr(obj.nextLine()));
    }
}
