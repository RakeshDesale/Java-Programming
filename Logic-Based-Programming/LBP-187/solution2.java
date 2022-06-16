# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void last2Char(String str){
        int n = str.length();
        System.out.println(str.charAt(n-1)+","+str.charAt(n-2));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        last2Char(str);
    }
}
