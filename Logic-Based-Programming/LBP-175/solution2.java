# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPrime(int n){
        int i,factors = 0;
        for(i = 1;i <= n;i++){
            if(n%i == 0)
                factors++;
        }
        return factors == 2;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        for(i = 2;i <= n;i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }
}
