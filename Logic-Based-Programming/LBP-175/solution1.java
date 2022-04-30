# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,j,factors;
        for(i = 2;i <= n;i++){
            factors = 0;
            for(j = 1;j <= i;j++){
                if(i%j == 0)
                    factors++;
            }
            if(factors == 2)
                System.out.print(i+" ");
        }
    }
}
