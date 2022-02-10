# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int n = str.length();
        if(n%2==0)
            System.out.println(str.charAt(n/2-1)+""+str.charAt(n/2));
        else
            System.out.println(str.charAt(n/2));
    }
}
