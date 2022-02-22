# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean reward(String str){
        int i,countA=0;
        if(str.length()==0)
            System.exit(0);
        else{
            for(i=0;i<str.length();i++){
                if(str.charAt(i)=='A')
                    countA++;
            }
        }
        return(countA>1 || str.contains("LLL"));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(reward(obj.nextLine())?"No":"Yes");
    }
}
