# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),a,b,c;
        if(n>=10 && n<=99){
            a=n%10;
            b=(n/10)%10;
            c=(a+b)+(a*b);
            System.out.println((c==n)?"Yes":"No");
        }
        else
            System.exit(0);
    }
}
