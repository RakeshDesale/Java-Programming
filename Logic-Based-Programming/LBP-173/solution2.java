# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int base17(String str){
        return (Integer.valueOf(str,17));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(base17(obj.nextLine()));
    }
}
