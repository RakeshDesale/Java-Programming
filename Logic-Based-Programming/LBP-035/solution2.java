# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int numMsg=obj.nextInt(),d,sum=0;
        while(numMsg!=0){
            d=numMsg%10;
            if(d==4||d==6||d==8||d==9)
                sum=sum+d;
            numMsg=numMsg/10;
        }
        System.out.println(sum);
    }
}
