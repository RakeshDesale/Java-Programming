# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str1=obj.nextLine(),str2=obj.nextLine();
        System.out.println(str1.endsWith(str2));
    }
}
