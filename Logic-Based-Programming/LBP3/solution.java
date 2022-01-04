# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int year=obj.nextInt();
        if ((year%4==0 && year%100!=0)||(year%400==0))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
