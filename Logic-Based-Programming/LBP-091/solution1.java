# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void alphabetPosition(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
                System.out.print(str.charAt(i)-96+" ");
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        alphabetPosition(obj.nextLine().toLowerCase());
    }
}
