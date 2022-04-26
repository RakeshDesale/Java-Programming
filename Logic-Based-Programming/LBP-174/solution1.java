# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        for(int i=0;i<str.length();i++)
            System.out.print((int)str.charAt(i)-97);
    }
}
