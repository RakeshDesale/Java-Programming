# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int i,count=0;
        if(str.charAt(0)=='#' && str.length()==7){
            for(i=1;i<str.length();i++){
                if((str.charAt(i)>='A' && str.charAt(i)<='F') || (str.charAt(i)>='a' && str.charAt(i)<='f') || (str.charAt(i)>='0' && str.charAt(i)<='9'))
                    count++;
            }
        }
        System.out.println(count==6);
    }
}
