# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int balancedParenthesis(String str){
        int i,count=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='(')  count++;
            else if(str.charAt(i)==')') count--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(balancedParenthesis(obj.nextLine()));
    }
}
