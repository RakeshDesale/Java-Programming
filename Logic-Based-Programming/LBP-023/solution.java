# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),d,sum=0,prod=1,temp,res=0;
        if(n>=10 && n<=99){
            temp=n;
            while(n!=0){
                d=n%10;
                sum=sum+d;
                prod=prod*d;
                n=n/10;
            }
            res=sum+prod;
            if(temp==res)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
            System.exit(0);
    }
}
