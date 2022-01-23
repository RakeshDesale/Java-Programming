# Using ASCII Values

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int count=0,i;
        if (str.length()==0)
            System.exit(0);
        for (i=0;i<str.length();i++){
            if ((str.charAt(i)>=97 && str.charAt(i)<=122) || (str.charAt(i)>=65 && str.charAt(i)<=90) || (str.charAt(i)>=48 && str.charAt(i)<=57))
                continue;
            else
                count++;
        }
        System.out.println(count);
    }
}
