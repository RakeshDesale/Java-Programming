# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num1 = obj.nextInt(), num2 = obj.nextInt(), i ,gcd = 0;
        for(i = 1;i <= num1 && i <= num2;i++){
            if(num1%i == 0 && num2%i == 0)
                gcd = i;
        }
        System.out.println(gcd);
    }
}
