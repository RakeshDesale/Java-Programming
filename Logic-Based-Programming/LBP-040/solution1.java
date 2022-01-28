# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),d,rev=0;
        while(n!=0){
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println(rev);
    }
}
