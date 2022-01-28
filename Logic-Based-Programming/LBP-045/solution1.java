# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean isperfect(int n){
        int i,sum=0;
        for(i=1;i<n;i++){
            if(n%i==0)
                sum=sum+i;
        }
        return (sum==n);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n>0)
            System.out.println((isperfect(n))?"true":"false");
        else
            System.exit(0);
    }
}
