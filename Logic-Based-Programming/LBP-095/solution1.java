# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void firstLetterOfWord(String[] str){
        for(String ss:str)
            System.out.print(ss.charAt(0));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String[] str = obj.nextLine().split(" ");
        firstLetterOfWord(str);
    }
}
