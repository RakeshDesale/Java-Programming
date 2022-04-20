# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),arr[] = new int[n],i,temp,count,count1 = 0,splc = 0,ele=0;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            count = 0;
            temp = arr[i];
            while(temp!=0){
                if(temp%10 == 5)
                    count++;
                temp = temp/10;
            }
            if(count1 <= count){
                count1 = count;
                ele = arr[i];
            }
            if(count == 0)
                splc++;
        }
        System.out.println((splc != n)?ele:arr[0]);
    }
}
