# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int countA=0;
        if(str.length()==0)
            System.exit(0);
        else{
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)=='A')
                    countA++;
            }
        }
        if(countA>1 || str.contains("LLL"))
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
