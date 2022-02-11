# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String removeDuplicate(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(res.indexOf(ch)<0)
                res=res+ch;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(removeDuplicate(obj.nextLine()));
    }
}
