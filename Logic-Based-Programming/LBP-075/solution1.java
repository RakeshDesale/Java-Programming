# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int firstVowel(String str){
        int i;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                break;
        }
        return i;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(firstVowel(obj.nextLine()));
    }
}
