# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int n = str.length();
        System.out.println(str.charAt(n-1)+","+str.charAt(n-2));
    }
}
