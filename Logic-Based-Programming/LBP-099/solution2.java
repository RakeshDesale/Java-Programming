# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void capitalizeFirstLetter(String str[]){
        for(String ss:str)
            System.out.print(ss.substring(0,1).toUpperCase()+ss.substring(1)+" ");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str[] = obj.nextLine().split(" ");
        capitalizeFirstLetter(str);
    }
}
