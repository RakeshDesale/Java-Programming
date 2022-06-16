# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),d,sum;
        while(true){
            if(n >= 0 && n <= 9){
                System.out.println(n);
                break;
            }
            else{
                sum = 0;
                while(n != 0){
                    d = n % 10;
                    sum = sum + d;
                    n = n /10;
                }
                n = sum;
            }
        }
    }
}
