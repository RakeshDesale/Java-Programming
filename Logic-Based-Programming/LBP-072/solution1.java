# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static String HelloBye(String str, int num){
        if(num==1)
            return "Hello "+str;
        else
            return "Bye "+str;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        System.out.println(HelloBye(name,obj.nextInt()));
    }
}
