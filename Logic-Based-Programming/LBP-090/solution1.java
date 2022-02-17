# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        for(int i='a';i<='z';i++){
            if(str.indexOf(i)==-1)
                System.out.print((char)(i));
        }
    }
}
