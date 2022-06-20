# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int b = obj.nextInt(),e = obj.nextInt(),m = obj.nextInt();
        System.out.println((int)Math.pow(b,e)%m);
    }
}
