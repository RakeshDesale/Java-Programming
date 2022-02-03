# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String reversed(String str){
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(reversed(obj.nextLine()));
    }
}
