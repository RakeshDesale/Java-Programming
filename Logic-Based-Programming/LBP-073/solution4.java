# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        try{
            int n = Integer.parseInt(str);
            System.out.println(n>9999 && n<100000);
        }
        catch(Exception e){
            System.out.println(false);
        }        
    }
}
