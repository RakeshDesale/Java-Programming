# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s1 = obj.nextLine(),s2 = obj.nextLine();
        StringBuffer sb1 = new StringBuffer(),sb2 = new StringBuffer();
        for(int i = 0; i<s1.length()-1;i++){
            if(s1.charAt(i) != '#' && s1.charAt(i+1) != '#')
                sb1.append(s1.charAt(i));
        }
        sb1.append(s1.charAt(s1.length()-1));
        for(int i = 0; i<s2.length()-1;i++){
            if(s2.charAt(i) != '#' && s2.charAt(i+1) != '#')
                sb2.append(s2.charAt(i));
        }
        sb2.append(s2.charAt(s2.length()-1));
        System.out.println((sb1.toString().equals(sb2.toString()))?"1":"0");
    }
}
