# Another Approach Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void repeatChar(String str){
        int i;
        for(i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+""+str.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        repeatChar(obj.nextLine());
    }
}
