# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int getSequenceSum(int i, int j, int k){
        int a,sum=0;
        for (a=i;a<j;a++)
            sum=sum+a;
        for (a=j;a>=k;a--)
            sum=sum+a;
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i=obj.nextInt(),j=obj.nextInt(),k=obj.nextInt();
        System.out.println(getSequenceSum(i,j,k));
    }
}
