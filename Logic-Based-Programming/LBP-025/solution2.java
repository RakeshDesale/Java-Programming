# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double celsius=obj.nextDouble(),fahrenheit;
        fahrenheit=celsius*1.8+32;
        int f=(int)fahrenheit;
        System.out.println(f);
    }
}
