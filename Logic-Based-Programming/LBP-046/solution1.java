# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String[] str=obj.nextLine().split("-");
        System.out.println(str[2].endsWith(Integer.toString(Integer.parseInt(str[0])*Integer.parseInt(str[1]))));
    }
}
