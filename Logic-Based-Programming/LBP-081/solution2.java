# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void evenLengthWord(String[] str){
        for(int i=0;i<str.length;i++){
            if(str[i].length()%2==0)
                System.out.print(str[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        evenLengthWord(obj.nextLine().split(" "));
    }
}
