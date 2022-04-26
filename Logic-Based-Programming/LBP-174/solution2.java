# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int prodBarcode(int c){
        return c-97;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        for(int i=0;i<str.length();i++)
            System.out.print((int)prodBarcode(str.charAt(i)));
    }
}
