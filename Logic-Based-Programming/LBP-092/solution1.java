# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        char ch = obj.nextLine().charAt(0);
        int count=1;
        if(str.length()==0)
            System.exit(0);
        else{
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==ch)
                    System.out.print(count++);
                else
                    System.out.print(str.charAt(i));
            }
        }
    }
}
