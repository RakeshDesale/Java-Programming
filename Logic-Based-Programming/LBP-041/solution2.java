# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int generateOTP(int n){
        int d,prod=1;
        while(n!=0){
            d=n%10;
            prod=prod*d;
            n=n/10;
        }
        return prod;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(generateOTP(obj.nextInt()));
    }
}
