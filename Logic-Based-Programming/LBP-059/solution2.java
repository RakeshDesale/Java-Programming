# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isAnagram(String str1,String str2){
        char a[]=str1.toCharArray();
        char b[]=str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return(Arrays.equals(a,b));
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String a=obj.nextLine(),b=obj.nextLine();
        System.out.println(isAnagram(a,b));
    }
}
