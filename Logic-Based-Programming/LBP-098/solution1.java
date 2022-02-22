# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int i,count=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
                count++;
        }
        System.out.println((count==str.length())?"Yes":"No");
    }
}
