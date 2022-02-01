# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int wordCount(String str){
        int i,count=1;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(wordCount(obj.nextLine()));
    }
}
