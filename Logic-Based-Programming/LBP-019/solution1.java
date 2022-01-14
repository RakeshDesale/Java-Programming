# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),d,i=0,a[]=new int[20];
        if(n>=0){
            while(n!=0){
                d=n%2;
                a[i++]=d;
                n=n/2;
            }
            for(i=i-1;i>=0;i--)
                System.out.print(a[i]);
        }
        else
            System.exit(0);
    }
}
