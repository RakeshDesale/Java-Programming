# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void secretInfo(String str){
        for(int i=0;i<str.length();i++){
            if((str.charAt(i)>='A' && str.charAt(i)<='Z') || (str.charAt(i)>='0' && str.charAt(i)<='9'))
                System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        secretInfo(str);
    }
}
