# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),i,sum=0;
        for(i=1;i<n;i++){
            if(n%i==0)
                sum=sum+i;
        }
        System.out.println(sum==n);
    }
}
