# Using Inbuilt Functions

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int maxDigit(int n){
        int d,m=0;
        while(n!=0){
            d=n%10;
            if(d>m)
                m=d;
            n=n/10;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt(),n2=obj.nextInt(),n3=obj.nextInt(),w,x,y,z;
        if (n1>=100 && n1<=999 && n2>=100 && n2<=999 && n3>=100 && n3<=999){
            w=(Math.min(Math.min(n1%10,n2%10),n3%10)); //Math module & it's min function accepts only two arguments. Hence two times Math.min
            x=(Math.min(Math.min((n1/10)%10,(n2/10)%10),(n3/10)%10));
            y=(Math.min(Math.min((n1/100)%10,(n2/100)%10),(n3/100)%10));
            z=(Math.max(Math.max(maxDigit(n1),maxDigit(n2)),maxDigit(n3)));
            System.out.println(z*1000+y*100+x*10+w);
        }
        else
            System.exit(0);
    }
}
