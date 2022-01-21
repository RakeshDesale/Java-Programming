# Another Way Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),i,factors=0;
        for (i=1;i<=n;i++){
            if(n%i==0)
                factors++;
        }
        System.out.println((factors==2)?"true":"false");
      // Instead of above statement, we may use the following statement.
      // System.out.println(factors==2);
    }
}
