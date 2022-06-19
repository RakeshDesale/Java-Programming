# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String rating(int points){
        if(points >= 30 && points <= 50)
            return "Average";
        else if(points >= 51 && points <= 60)
            return "Good";
        else if(points >= 61 && points <= 80)
            return "Excellent";
        else
            return "Outstanding";
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int points = obj.nextInt();
        if(points >= 30 && points <= 100)
            System.out.println(rating(points));
        else
            System.exit(0);
    }
}
