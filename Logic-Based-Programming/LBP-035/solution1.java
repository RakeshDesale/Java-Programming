# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int numMsg=obj.nextInt(),d,sum=0;
        while(numMsg!=0){
            d=numMsg%10;
            if(d==0||d==1||d==2||d==3||d==5||d==7)
                continue;
            else
                sum=sum+d;
            numMsg=numMsg/10;
        }
        System.out.println(sum);
    }
}
