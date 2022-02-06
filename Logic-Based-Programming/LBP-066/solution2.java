# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int i;
        for(i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+""+str.charAt(i));
        }
    }
}
