# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String cs = obj.nextLine();
        String cv = obj.nextLine();
        int i,j=0;
        for(i=0;i<cs.length();i++){
            if(cs.charAt(i)=='*')
                System.out.print(cv.charAt(j++));
            else
                System.out.print(cs.charAt(i));
        }
    }
}
