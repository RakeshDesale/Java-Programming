# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int convert(char s){
        return s-48;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int min,sec;
        if(str.charAt(0)=='0')
            min=convert(str.charAt(1));
        else
            min=convert(str.charAt(0))*10+convert(str.charAt(1));
        if(str.charAt(3)=='0')
            sec=convert(str.charAt(4));
        else
            sec=convert(str.charAt(3))*10+convert(str.charAt(4));
        System.out.println(min*60+sec);
    }
}
