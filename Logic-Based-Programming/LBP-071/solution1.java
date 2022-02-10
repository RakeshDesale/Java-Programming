# Using Regular Expression

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String replaceVowel(String str, String ch){
        return (str.replaceAll("[aeiou]",ch));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        System.out.println(replaceVowel(str,obj.nextLine()));
    }
}
