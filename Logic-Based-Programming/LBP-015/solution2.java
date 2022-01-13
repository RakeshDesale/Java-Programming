# Using String Function:

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        System.out.println(s.contains("0")?"Yes":"No");
    }
}
