# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int reverse(int n){
        int d,rev = 0;
        while(n != 0){
            d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(Math.abs(n - reverse(n)));
    }
}
