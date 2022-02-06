# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int vowelCount(String str){
        int i,count=0;
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println(vowelCount(obj.nextLine()));
    }
}
