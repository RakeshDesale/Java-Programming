# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int i;
        boolean flag=false;
        for(i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                flag=true;
                break;
            }
        }
        System.out.println(flag);
    }
}
