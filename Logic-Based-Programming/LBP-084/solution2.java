# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str1 = obj.nextLine();
        char ch[] = str1.toCharArray();
        Arrays.sort(ch);
        String str2 = new String(ch);
        System.out.println(str1.equals(str2));
    }
}
