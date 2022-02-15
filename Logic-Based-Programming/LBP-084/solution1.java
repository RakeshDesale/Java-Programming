# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean strOrder(String str1){
        char ch[] = str1.toCharArray();
        Arrays.sort(ch);
        String str2 = new String(ch);
        return (str1.equals(str2));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(strOrder(obj.nextLine()));
    }
}
