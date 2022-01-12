# Without Using String Function

# Solution:

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),count=0;
        if(n>0){
            while (n!=0){
                n=n/10;
                count++;
            }
            System.out.println(count);
        }
        else
            System.exit(0);
    }
}
