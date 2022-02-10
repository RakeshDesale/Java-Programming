# Traditional Approach

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String replaceVowel(String str, char ch){
        char st[] = new char[str.length()];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                st[i]=ch;
            else
                st[i]=str.charAt(i);
        }
        String sb = new String(st);
        return sb;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        char ch = obj.next().charAt(0);
        System.out.println(replaceVowel(str,ch));
        }
}
