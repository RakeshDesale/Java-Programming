# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int d,sum=0;
        if (n>0){
            while(n!=0){
                d=n%10;
                if(d%2==0)
                    sum=sum+d;
                n=n/10;
            }
            System.out.println(sum);
        }
    }
}
