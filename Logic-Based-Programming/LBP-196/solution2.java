# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int modRes(int b, int e, int m){
        return ((int)Math.pow(b,e)%m);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int b = obj.nextInt(),e = obj.nextInt(),m = obj.nextInt();
        System.out.println(modRes(b,e,m));
    }
}
