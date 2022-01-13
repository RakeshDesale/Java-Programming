# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),d,flag=0;
        if(n>=0){
            while(n!=0){
                d=n%10;
                if(d==0){
                    flag=1;
                    break;
                }
                n=n/10;
            }
            if(flag==1)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        else
            System.exit(0);
    }
}
