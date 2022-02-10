# Another Approach

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void HelloBye(String str, int num){
        if(num==1)
            System.out.println("Hello "+str);
        else
            System.out.println("Bye "+str);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String name = obj.nextLine();
        HelloBye(name,obj.nextInt());
    }
}
