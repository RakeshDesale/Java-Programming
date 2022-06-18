# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,d,sum,temp;
        for(i = 2;i <= n;i++){
            sum = 0;
            temp = i;
            while(temp != 0){
                d = temp % 10;
                sum = sum + (d * d * d);
                temp = temp / 10;
            }
            if(i == sum)
                System.out.print(i+" ");
        }
    }
}
