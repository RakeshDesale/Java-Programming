# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void checkPrime(int n){
        int i,flag=0;
        for (i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("false");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("true");
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n>1){
            checkPrime(n);
        }
        else
            System.exit(0);
    }
}
