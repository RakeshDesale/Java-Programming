# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine(),res="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(res.indexOf(ch)<0)
                res=res+ch;
        }
        System.out.println(res);
    }
}
