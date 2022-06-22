# Another Way

# Optimized Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = Integer.parseInt(new StringBuffer(obj.nextLine()).reverse().toString());
        int d;
        while(n != 0){
            d = n % 10;
            if(d % 2 == 0)
                System.out.print(d + 1);
            else
                System.out.print(d - 1);
            n = n / 10;
        }
    }
}
