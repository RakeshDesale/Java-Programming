# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void sortedStr(String str){
        for(int i='a';i<='z';i++){
            if(str.indexOf(i)==-1)
                System.out.print((char)(i));
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        sortedStr(obj.nextLine());
    }
}
