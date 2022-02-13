# Using Core Concept

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isValidHex(String str){
        int i,count=0;
        if(str.charAt(0)=='#' && str.length()==7){
            for(i=1;i<str.length();i++){
                if((str.charAt(i)>='A' && str.charAt(i)<='F') || (str.charAt(i)>='a' && str.charAt(i)<='f') || str.charAt(i)>='0' && str.charAt(i)<='9')
                    count++;
            }
        }
        return count==6;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(isValidHex(obj.nextLine()));
    }
}
