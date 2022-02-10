# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String midChar(String str){
        int n = str.length();
        if(n%2==0)
            return (str.charAt(n/2-1)+""+str.charAt(n/2));
        else
            return (str.charAt(n/2)+"");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(midChar(obj.nextLine()));
    }
}
