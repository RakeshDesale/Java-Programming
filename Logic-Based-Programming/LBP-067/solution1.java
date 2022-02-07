# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean wordIdentical(String str){
        int flag=0,i;
        for(i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                flag=1;
                break;
            }
        }
        return flag==1;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(wordIdentical(obj.nextLine())?"true":"false");
    }
}
