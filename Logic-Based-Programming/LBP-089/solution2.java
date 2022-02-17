# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean rotation(String str1,String str2){
        return (str1+str1).contains(str2);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine(), str2 = obj.nextLine();
        System.out.println(rotation(str1,str2));
    }
}
