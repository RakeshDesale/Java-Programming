# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int reverse(int n){
        int d,rev = 0;
        while(n != 0){
            d = n%10;
            rev = rev*10+d;
            n = n/10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), i = 0, d, len, sumEven = 0, sumOdd = 0, arr[] = new int[100];
        n = reverse(n);
        while(n != 0){
            d = n%10;
            arr[i++] = d;
            n = n/10;
        }
        len = i;
        for(i=0;i<len;i++){
            if(i%2 == 0)
                sumEven = sumEven + arr[i];
            else
                sumOdd = sumOdd + arr[i];
        }
        System.out.println(sumOdd - sumEven);
    }
}
