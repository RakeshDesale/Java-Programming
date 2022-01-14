# Using Standard Inbuilt Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n>=0){
            System.out.println(Integer.toBinaryString(n));
        }
        else
            System.exit(0);
    }
}
