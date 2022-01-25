# Using Regular Expression

# Solution:

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        Pattern p= Pattern.compile("[a-z]+[0-9|_]@gmail.com");
        Matcher m=p.matcher(str);
        if(m.find()&&(m.group()).equals(str))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
