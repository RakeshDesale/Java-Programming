# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isPrime(int n){
        int i,factors=0;
        for(i=1;i<=n;i++){
            if(n%i==0)
                factors++;
        }
        return (factors==2); // returns true if factors==2 else returns false
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int rl=obj.nextInt(),rr=obj.nextInt(),i,sum=0;
        for(i=rl;i<=rr;i++){
            if(isPrime(i))
                sum=sum+i;
        }
        System.out.println(sum);
    }
}
