# Using Regular Expression

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean validHex(String str){
        return (str.matches("#[A-Fa-f0-9]{6}"));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(validHex(obj.nextLine()));
    }
}
