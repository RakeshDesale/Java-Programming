# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),d,sum=0,temp=n;
        if(n>0){
            while(n!=0){
                d=n%10;
                sum=sum+d;
                n=n/10;
            }
            if(temp%sum==0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
            System.exit(0);
    }
}
