# Without Using Third String Variable

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String swapString(String str1, String str2){
        str1=str1+str2;
        str2=str1.substring(0,str1.length()-str2.length());
        str1=str1.substring(str2.length());
        return str1+" "+str2;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine(),str2=obj.nextLine();
        System.out.println(swapString(str1,str2));
    }
}
