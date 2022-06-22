# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int revDigit(int n){
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
        int n = obj.nextInt(), d;
        n = revDigit(n);
        while(n != 0){
            d = n % 10;
            if(d % 2 == 0)
                System.out.print(d + 1);
            else
                System.out.print(d - 1);
            n = n / 10;
        }
    }
}
