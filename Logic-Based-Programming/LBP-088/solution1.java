# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine(), row1 = "qwertyuiop", row2 = "asdfghjkl", row3 = "zxcvbnm";
        int i,j,count1=0,count2=0,count3=0;
        for(i=0;i<str.length();i++){
            for(j=0;j<row1.length();j++){
                if(str.charAt(i)==row1.charAt(j))
                    count1++;
            }
            for(j=0;j<row2.length();j++){
                if(str.charAt(i)==row2.charAt(j))
                    count2++;
            }
            for(j=0;j<row3.length();j++){
                if(str.charAt(i)==row3.charAt(j))
                    count3++;
            }
        }
        System.out.println(count1==str.length() || count2==str.length() || count3==str.length());
    }
}
