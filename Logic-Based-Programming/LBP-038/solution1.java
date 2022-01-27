# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int count=0,i;
        if(s.length()!=0){
            for(i=0;i<s.length();i++){
                /* ch= s.charAt(i);
                if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0'&& s.charAt(i)<='9')||(s.charAt(i)==' '))*/
                //Instead of this, we may use following statement
                
                if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z')||(s.charAt(i)>='0'&& s.charAt(i)<='9')||(s.charAt(i)==' '))
                    continue;
                else
                    count++;
            }
            System.out.println(count);
        }
        else
            System.exit(0);
    }
}
