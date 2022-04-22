# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), i, fact =1,count = 0;
        for(i=1;i<=n;i++)
            fact = fact * i;
        while(fact != 0){
            if(fact%10 == 0)
                count++;
            else
                break;
            fact = fact/10;
        }
        System.out.println(count);
    }
}
