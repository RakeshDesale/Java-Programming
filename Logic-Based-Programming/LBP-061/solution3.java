# Using Contraints

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        if(s.length()==2){
            if((s.charAt(0)>='a' && s.charAt(0)<='h') && (s.charAt(0)>='1' && s.charAt(1)<='8')){
                int x=s.charAt(0)-96;
                int y=s.charAt(1);
                System.out.println(x%2!=y%2);
            }
            else
                System.exit(0);
        }
        else
            System.exit(0);
    }
}
