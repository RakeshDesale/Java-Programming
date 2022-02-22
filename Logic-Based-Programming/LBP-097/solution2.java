# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int consonentCount(String str){
        int i,count=0;
        for(i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(consonentCount(obj.nextLine()));
    }
}
