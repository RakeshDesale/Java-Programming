# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),d,sum = 0;
        if(n >= 1 && n <= 26){
            System.out.println((char)(n + 64));
        }
        else{
            while(n != 0){
                d = n % 10;
                sum = sum + d;
                n = n / 10;
            }
            System.out.println((char)(sum + 64));
        }
    }
}
