# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int stoneCount(String jw, String st){
        int i,j,count=0;
        for(i=0;i<jw.length();i++){
            for(j=0;j<st.length();j++){
                if(jw.charAt(i)==st.charAt(j))
                    count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String jw=obj.nextLine(),st=obj.nextLine();
        System.out.println((stoneCount(jw,st)));
    }
}
