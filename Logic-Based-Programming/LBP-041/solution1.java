# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),d,prod=1;
        while(n!=0){
            d=n%10;
            prod=prod*d;
            n=n/10;
        }
        System.out.println(prod);
    }
}
