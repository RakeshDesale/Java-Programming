# Using While Loop

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPrime(int n){
        int factors=0,i;
        for(i=1;i<=n;i++){
            if(n%i==0)
                factors++;
        }
        return factors==2;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        while(true){
            if(isPrime(n)){
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
