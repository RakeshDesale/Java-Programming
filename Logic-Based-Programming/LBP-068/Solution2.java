# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void scoreBoard(String str){
        int i, Acount=0, Bcount=0, Ccount=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='A')
                Acount++;
            else if(str.charAt(i)=='B')
                Bcount++;
            else
                Ccount++;
        }
        System.out.println(Acount+" "+Bcount+" "+Ccount);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        scoreBoard(obj.nextLine());
    }
}
