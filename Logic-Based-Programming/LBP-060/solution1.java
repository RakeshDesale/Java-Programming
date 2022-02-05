# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String s=obj.nextLine();
        int a[]=new int[256],i,max=0;
        for(i=0;i<s.length();i++)
            a[(int)s.charAt(i)]++;
        for(i=0;i<256;i++){
            if(a[i]>a[max])
                max=i;
        }
        System.out.println((char)max);
    }
}
