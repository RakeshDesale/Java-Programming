# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int d,n=obj.nextInt();
        if(n>0){
            while(n!=0){
                d=n%10;
                System.out.print(d+" ");
                n=n/10;
            }
        }
    }
}
