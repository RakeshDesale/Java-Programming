# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int i,count1=0,count2=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='x')
                count1++;
            else if(str.charAt(i)=='o')
                count2++;
        }
        System.out.println(((count1==count2) || (count1==0 && count2==0))?"true":"false");
    }
}
