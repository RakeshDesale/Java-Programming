# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int n = str.length(),i,sum=0;
        for(i=0;i<n;i++)
            sum = sum + (str.charAt(i)-96);
        System.out.printf("%.2f",(sum/(float)n));
    }
}
