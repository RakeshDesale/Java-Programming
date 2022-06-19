# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int nearestWholeNumber(int n){
        while(true){
            if(n % 10 == 0)
                return n;
            else
                n++;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(nearestWholeNumber(obj.nextInt()));
    }
}
