# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void shutterWord(String str){
        System.out.println(str.substring(0,2)+"..."+str.substring(0,2)+"..."+str+"?");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        shutterWord(obj.nextLine());
    }
}
