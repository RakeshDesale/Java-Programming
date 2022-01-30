# Another Apporach Using Predefine Function without Function Call

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int min,sec;
        if(str.charAt(0)=='0')
            min=Integer.parseInt(str.substring(1,2));
        else
            min=Integer.parseInt(str.substring(0,2));
        if(str.charAt(3)=='0')
            sec=Integer.parseInt(str.substring(4,5));
        else
            sec=Integer.parseInt(str.substring(3,5));
        System.out.println(min*60+sec);
    }
}
