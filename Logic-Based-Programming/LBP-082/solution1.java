# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String nextLetter(String str){
        char s[] = new char[str.length()];
        for(int i=0;i<str.length();i++)
            s[i]=((char)(str.charAt(i)+1));
        String st = new String(s);
        return st;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(nextLetter(obj.nextLine()));
    }
}
