# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),key=obj.nextInt(),d,count=0;
        while(n!=0){
            d=n%10;
            if(d==key)
                count++;
            n=n/10;
        }
        System.out.println(count);
    }
}
