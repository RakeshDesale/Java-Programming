# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean findWord(String str, String st[]){
        boolean flag = false;
        for(String s:st){
            if(s.equals(str)){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine(), st[] = {"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
        System.out.println(findWord(str,st));
    }
}
