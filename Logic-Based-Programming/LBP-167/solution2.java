# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int countTrailZero(int n){
        int count = 0;
        while(n != 0){
            if(n%10 == 0)
                count++;
            else
                break;
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), i, fact =1;
        for(i=1;i<=n;i++)
            fact = fact * i;
        System.out.println(countTrailZero(fact));
    }
}
