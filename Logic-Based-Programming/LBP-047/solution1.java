# Version 1

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean oddEven(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return (sum%2==0);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n>0)
            System.out.println(oddEven(n)?"Evenish":"Oddish");
        else
            System.exit(0);
    }
}
