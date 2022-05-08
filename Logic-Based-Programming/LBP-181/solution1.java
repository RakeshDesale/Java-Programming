# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int i,j,u,count = 0;
        for(i=0;i<str.length();i++){
            u = 1;
            for(j=0;j<str.length();j++){
                if(i!=j && str.charAt(i) == str.charAt(j)){
                    u = 0;
                    break;
                }
            }
            if(u == 1){
                count++;
                if(count == 2){
                    System.out.println(str.charAt(i));
                    break;
                }
            }
        }
    }
}
