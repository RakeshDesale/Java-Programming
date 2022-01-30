# Another Apporach Using Predefine Function with Function Call

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int minToSec(String str){
        int min,sec;
        if(str.charAt(0)=='0')
            min=Integer.parseInt(str.substring(1,2));
        else
            min=Integer.parseInt(str.substring(0,2));
        if(str.charAt(3)=='0')
            sec=Integer.parseInt(str.substring(4,5));
        else
            sec=Integer.parseInt(str.substring(3,5));
        return min*60+sec;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(minToSec(obj.nextLine()));
    }
}
