# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        int num = obj.nextInt();
        if(num==1)
            System.out.println("Hello "+name);
        else
            System.out.println("Bye "+name);
    }
}
