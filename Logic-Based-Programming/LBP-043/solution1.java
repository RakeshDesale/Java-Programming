# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),d,sumeven=0,sumodd=0;
        while(n!=0){
            d=n%10;
            if(d%2==0)
                sumeven=sumeven+d;
            else
                sumodd=sumodd+d;
            n=n/10;
        }
        System.out.println(sumeven*sumodd);
    }
}
