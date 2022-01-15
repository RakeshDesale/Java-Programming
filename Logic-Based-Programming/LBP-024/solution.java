# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt(),y=obj.nextInt(),sum=0,i;
        for (i=x;i<=y;i++){
            if(i%2==0)
                sum=sum+i;
            else
                continue;
        }
        System.out.println(sum);
    }
}
