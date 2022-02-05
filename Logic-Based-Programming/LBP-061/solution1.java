# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int x=s.charAt(0)-96;
        int y=s.charAt(1);
        System.out.println(x%2!=y%2);
    }
}
