# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static float arrAvg(String str, int n){
        int i,sum=0;
        for(i=0;i<n;i++)
            sum = sum + (str.charAt(i)-96);
        return (sum/(float)n);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int n = str.length();
        System.out.printf("%.2f",arrAvg(str,n));
    }
}
