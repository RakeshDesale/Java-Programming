# Using Function and Without Creating an Array

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int multipleArr(int m, int i){
        return m*i;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt(), n = obj.nextInt(),i;
        for(i=1;i<=n;i++)
            System.out.print(multipleArr(m,i)+" ");
    }
}
