# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        System.out.println(str.substring(0,2)+"..."+str.substring(0,2)+"..."+str+"?");
    }
}
