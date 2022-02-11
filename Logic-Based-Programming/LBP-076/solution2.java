# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine(),res="";
        StringTokenizer st = new StringTokenizer(str);
        int max=0;
        while(st.hasMoreTokens()){
            String token = st.nextToken();
            if(token.length()>max){
                max=token.length();
                res=token;
            }
        }
        System.out.println(res);
    }
}
