# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static char updatePassword(char ch){
        if(ch >= 'A' && ch <= 'Z')
            return ((char)(ch + 32));
        else
            return ((char)(ch - 32));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        for(int i = 0;i < str.length();i++){
            System.out.print(updatePassword(str.charAt(i)));
        }
    }
}
