# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String removeVowel(String str){
        return(str.replaceAll("[aeiou]",""));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(removeVowel(obj.nextLine()));
    }
}
