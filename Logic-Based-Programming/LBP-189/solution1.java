# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),d,rev = 0,temp = n;
        while(temp != 0){
            d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }        
        System.out.println(Math.abs(n - rev));
    }
}
