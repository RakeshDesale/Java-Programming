# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int discount(int n){
        int d,sumeven=0,sumodd=0;
        while(n!=0){
            d=n%10;
            if(d%2==0)
                sumeven=sumeven+d;
            else
                sumodd=sumodd+d;
            n=n/10;
        }
        return sumeven*sumodd;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(discount(obj.nextInt()));
    }
}
