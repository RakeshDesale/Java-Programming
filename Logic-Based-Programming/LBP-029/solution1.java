# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),i,flag=0;
        if(n>1){
            for(i=2;i<=n/2;i++){
                if(n%i==0){
                    System.out.println("false");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
                System.out.println("true");
        }
        else
            System.exit(0);
    }
}
