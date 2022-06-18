# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int sum(int n){
        int d,sum = 0;
        while(n != 0){
            d = n % 10;
            sum = sum + (d * d * d);
            n = n / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        for(i = 2;i <= n;i++){
            if(i == sum(i))
                System.out.print(i+" ");
        }
    }
}
