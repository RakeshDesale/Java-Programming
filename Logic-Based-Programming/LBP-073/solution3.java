# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean zipCode(String str){
        try{
            int n = Integer.parseInt(str);
            return(n>9999 && n<100000);
        }
        catch(Exception e){
            return(false);
        }        
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(zipCode(obj.nextLine()));
    }
}
