# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                System.out.print((char)(str.charAt(i)+32));
            else if(str.charAt(i)>='a' && str.charAt(i)<='z')
                System.out.print((char)(str.charAt(i)-32));
        }
    }
}
