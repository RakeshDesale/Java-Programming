# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String[] str = obj.nextLine().split(" ");
        for(String ss:str){
            System.out.print(ss.charAt(0));
        }
    }
}
