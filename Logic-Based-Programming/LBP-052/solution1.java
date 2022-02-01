# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String jw=obj.nextLine(),st=obj.nextLine();
        int i,j,count=0;
        for(i=0;i<jw.length();i++){
            for(j=0;j<st.length();j++){
                if(jw.charAt(i)==st.charAt(j))
                    count++;
            }
        }
        System.out.println(count);
    }
}
