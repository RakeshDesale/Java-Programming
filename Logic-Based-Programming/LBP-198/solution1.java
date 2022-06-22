# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), d, rev = 0, temp;
        temp = n;
        while(temp != 0){
            d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }
        n = rev;
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
