# Another Way Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void isPrime(int n){
        int i,factors=0;
        for (i=1;i<=n;i++){
            if(n%i==0)
                factors++;
        }
        System.out.println(factors==2);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        isPrime(obj.nextInt());
    }
}
