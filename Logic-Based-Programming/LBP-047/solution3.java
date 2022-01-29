# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),sum=0;
        if(n>0){
            while(n!=0){
                sum=sum+n%10;
                n=n/10;
            }
            System.out.println((sum%2==0)?"Evenish":"Oddish");
        }
        else
            System.exit(0);
    }
}
