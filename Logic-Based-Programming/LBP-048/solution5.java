# Using Predefine Function without Function Call

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine();//ab:cd
        int n1,n2;
        if(s.charAt(0)=='0')
            n1=Integer.valueOf(s.charAt(1)-48);
        else
            n1=Integer.valueOf(s.charAt(0)-48)*10+Integer.valueOf(s.charAt(1)-48);
        if(s.charAt(3)=='0')
            n2=Integer.valueOf(s.charAt(4)-48);
        else
            n2=Integer.valueOf(s.charAt(3)-48)*10+Integer.valueOf(s.charAt(4)-48);
        System.out.println(n1*60+n2);
    }
}
