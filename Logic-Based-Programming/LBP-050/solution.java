# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1=obj.nextInt(),n2=obj.nextInt(),sum=0,i;
        for(i=n1;i<=n2;i++){
            sum=sum+sumOfDigits(i);
        }
        System.out.println(sum);
    }
}
