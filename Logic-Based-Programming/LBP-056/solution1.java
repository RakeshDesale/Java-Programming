# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String swapString(String str1,String str2){
        String str3;
        str3=str1;
        str1=str2;
        str2=str3;
        return str1+" "+str2;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine(),str2=obj.nextLine();
        System.out.println(swapString(str1,str2));
    }
}
