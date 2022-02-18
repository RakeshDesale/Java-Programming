# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int i,j,flag;
        for(i=0;i<str.length();i++){
            flag=1;
            for(j=0;j<str.length();j++){
                if(i!=j && str.charAt(i)==str.charAt(j)){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                System.out.print(str.charAt(i));
                break;
            }
        }
    }
}
