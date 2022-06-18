# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int sumOfDigits(int n){
        int d, sum = 0;
        while(n != 0){
            d = n % 10;
            sum = sum + d;
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),d,sum = 0;
        while(true){
            if(n >= 1 && n <= 26){
                System.out.println((char)(n + 64));
                break;
            }
            else{
                n = sumOfDigits(n);
            }
        }
    }
}
