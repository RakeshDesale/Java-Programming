# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void replaceChar(String str, char ch){
        int i,count=1;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==ch)
                System.out.print(count++);
            else
                System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        char ch = obj.nextLine().charAt(0);
        if(str.length()==0)
            System.exit(0);
        else
            replaceChar(str,ch);
    }
}
