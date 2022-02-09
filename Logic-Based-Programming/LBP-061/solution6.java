# Using Function, ASCII Values and Using Constraints

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isChessBoard(String s){
        if(s.length()==2){
            if((s.charAt(0)>=97 && s.charAt(0)<=104) && (s.charAt(0)>=49 && s.charAt(1)<=56)){
                int x=s.charAt(0)-96;
                int y=s.charAt(1);
                return (x%2!=y%2);
            }
            else
                System.exit(0);
        }
        else
            System.exit(0);
        return false;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(isChessBoard(obj.nextLine()));
    }
}
