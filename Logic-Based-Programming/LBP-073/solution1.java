# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean zipCode(String str){
        int i,count=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                count++;
        }
        return (count==5);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(zipCode(obj.nextLine()));
    }
}
