# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String longestWord(String str){
        String res="";
        int max=0;
        StringTokenizer st = new StringTokenizer(str);
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.length()>max){
                max=token.length();
                res=token;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(longestWord(obj.nextLine()));
    }
}
