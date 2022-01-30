# Using Predefined Function with Function Call

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int minToSec(String str){
        int min,sec;
        if(str.charAt(0)=='0')
            min=Integer.valueOf(str.charAt(1)-48);
        else
            min=Integer.valueOf(str.charAt(0)-48)*10+Integer.valueOf(str.charAt(1)-48);
        if(str.charAt(3)=='0')
            sec=Integer.valueOf(str.charAt(4)-48);
        else
            sec=Integer.valueOf(str.charAt(3)-48)*10+Integer.valueOf(str.charAt(4)-48);
        return min*60+sec;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(minToSec(obj.nextLine()));
    }
}
