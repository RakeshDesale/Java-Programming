# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean findStr(String str){
        return str.contains("bomb");
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(findStr(obj.nextLine().toLowerCase())?"DUCK!":"Relax, there's no bomb.");
    }
}
