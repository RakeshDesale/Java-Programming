# Without Using Function

Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int min,sec;
        if(str.charAt(0)=='0')
            min=str.charAt(1)-48;
        else
            min=(str.charAt(0)-48)*10+str.charAt(1)-48;
        if(str.charAt(3)=='0')
            sec=str.charAt(4)-48;
        else
            sec=(str.charAt(3)-48)*10+str.charAt(4)-48;
        System.out.println(min*60+sec);
    }
}
