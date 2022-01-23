# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int min(int a, int b, int c){
        return (a<b && a<c)?a:(b<c?b:c);
    }
    
    static int max(int a, int b, int c){
        return (a>b && a>c)?a:(b>c?b:c);
    }
    
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
        if(n1>=100 && n1<=999 && n2>=100 && n2<=999 && n3>=100 && n3<=999){
            w=min(n1%10,n2%10,n3%10);
            x=min((n1/10)%10,(n2/10)%10,(n3/10)%10);
            y=min((n1/100)%10,(n2/100)%10,(n3/100)%10);
            z=max(maxDigit(n1),maxDigit(n2),maxDigit(n3));
            System.out.println(z*1000+y*100+x*10+w);
        }
        else
            System.exit(0);
    }
}
