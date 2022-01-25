# Using ASCII Values

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=65 && str.charAt(i)<=90)
                System.out.print((char)(str.charAt(i)+32));
            else if(str.charAt(i)>=97 && str.charAt(i)<=122)
                System.out.print((char)(str.charAt(i)-32));
        }
    }
}
