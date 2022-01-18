# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int fahrenheit=obj.nextInt(),celsius;
        celsius=(fahrenheit-32)*5/9;
        System.out.println(celsius);
    }
}
