# Using Recursion

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    public static void permute(String s, int left, int right){
        if(left==right)
            System.out.print(s+" ");
        else{
            for(int i=left;i<=right;i++){
                s = swap(s, left, i);
                permute(s,left+1,right);
                s = swap(s, left,i);
            }
        }
    }
    
    static String swap(String a, int i, int j){
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        permute(str,0,str.length()-1);
    }
}
