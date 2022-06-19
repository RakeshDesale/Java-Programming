# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int points = obj.nextInt();
        if(points >= 30 && points <= 100){
            if(points >= 30 && points <= 50)
                System.out.println("Average");
            else if(points >= 51 && points <= 60)
                System.out.println("Good");
            else if(points >= 61 && points <= 80)
                System.out.println("Excellent");
            else
                System.out.println("Outstanding");
        }
        else
            System.exit(0);
    }
}
