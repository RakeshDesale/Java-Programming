# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isStrMatched(String str1, String str2){
        return (str1.endsWith(str2));
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine(),str2=obj.nextLine();
        System.out.println(isStrMatched(str1,str2));
     }
}
