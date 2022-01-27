# Using Math.Max Package

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int BlackJack(int n1, int n2){
        if(n1>21 && n2>21)
            return 0;
        else if(n1==21 && n2==21)
            return 21;
        else if(n1>21)
            return n2;
        else if(n2>21)
            return n1;
        else
            return Math.max(n1,n2);
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt(),n2=obj.nextInt();
        System.out.println(BlackJack(n1,n2));
    }
}
