# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean parityCheck(int n){
        int count = 0;
        while(n!=0){
            if(n%2==1)
                count++;
            n = n/2;
        }
        return count%2==0;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        System.out.println(parityCheck(n)?"even":"odd");
    }
}
