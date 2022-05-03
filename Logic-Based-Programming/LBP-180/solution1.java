# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), count = 0;
        while(n!=0){
            if(n%2==1)
                count++;
            n = n/2;
        }
        System.out.println((count%2==0)?"even":"odd");
    }
}
