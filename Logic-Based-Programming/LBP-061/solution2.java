# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isChessBoard(String str){
        int x=str.charAt(0)-96;
        int y=str.charAt(1);
        return (x%2!=y%2);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(isChessBoard(obj.nextLine()));
    }
}
