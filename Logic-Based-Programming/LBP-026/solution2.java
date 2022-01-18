# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int fahrenheitToCelsius(int fahrenheit){
        return (((fahrenheit-32)*5)/9);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int fahrenheit=obj.nextInt(),celsius;
        System.out.println((int)fahrenheitToCelsius(fahrenheit));
    }
}
