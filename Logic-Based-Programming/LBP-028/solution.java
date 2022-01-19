# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int fib(int n){
        if(n==0 || n==1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }
    
    static int numberOfWays(int n){
        return fib(n+1);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println(numberOfWays(n));
    }
}
