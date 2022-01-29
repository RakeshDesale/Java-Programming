# Version 2

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean oddEven(int n){
        int sum=0;
        if(n>0){
            while(n!=0){
                sum=sum+n%10;
                n=n/10;
            }
        }
        else
            System.exit(0);
        return (sum%2==0);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(oddEven(obj.nextInt())?"Evenish":"Oddish");
    }
}
