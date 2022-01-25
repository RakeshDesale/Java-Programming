# Using Inbuilt Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int i=0;
        for (i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
