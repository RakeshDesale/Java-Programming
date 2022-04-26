# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine(), st[] = {"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
        boolean flag = false;
        for(String s:st){
            if(s.equals(str)){
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }
}
