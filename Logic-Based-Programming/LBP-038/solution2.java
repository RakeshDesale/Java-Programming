# Using ASCII Values

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int count=0,i,ch;
        if(s.length()!=0){
            for(i=0;i<s.length();i++){
                ch=s.charAt(i);
                if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)||(ch>=48 && ch<=57)||(ch==32))
                    continue;
                else
                    count++;
            }
            System.out.println(count);
        }
        else
            System.exit(0);
    }
}
