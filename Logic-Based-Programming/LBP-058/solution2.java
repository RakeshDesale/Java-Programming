# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String reform(String left,String right){
        return (left.substring(0,1).toUpperCase()+left.substring(1)+right);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String left=obj.nextLine(),right=obj.nextLine();
        System.out.println(reform(left,right));
    }
}
