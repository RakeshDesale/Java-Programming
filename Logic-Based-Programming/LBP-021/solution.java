# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),d,sum=0;
        if(n>=0){
            while(n!=0){
                d=n%10;
                if(d==2||d==3||d==5||d==7)
                    sum=sum+d;
                n=n/10;
            }
            System.out.println(sum);
        }
        else
            System.exit(0);
    }
}
