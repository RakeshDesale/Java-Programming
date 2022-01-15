# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int celsiusToFahrenheit(int celsius){
        double f;
        int i;
        f=celsius*1.8+32;
        i=(int)f;
        return i;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int celsius=obj.nextInt(),fahrenheit;
        fahrenheit=celsiusToFahrenheit(celsius);
        System.out.println(fahrenheit);
    }
}
