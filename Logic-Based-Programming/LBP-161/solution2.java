# Using Core Logic

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean conSeq(int a[], int b[], int n1, int n2){
        int i,j=0,temp,count=0,c[] = new int[n1+n2];
        for(i=0;i<n1;i++)
            c[j++] = a[i];
        for(i=0;i<n2;i++)
            c[j++] = b[i];
        for(i=0;i<(n1+n2);i++){
            for(j=i+1;j<(n1+n2);j++){
                if(c[i]>c[j]){
                    temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        for(i=0;i<(n1+n2)-1;i++){
            if(c[i]+1==c[i+1])
                count++;
        }
        return (count==(n1+n2)-1);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n1 = obj.nextInt(),i,a[] = new int[n1];
        for(i=0;i<n1;i++)
            a[i] = obj.nextInt();
        int n2 = obj.nextInt(),b[] = new int[n2];
        for(i=0;i<n2;i++)
            b[i] = obj.nextInt();
        System.out.println(conSeq(a,b,n1,n2));
    }
}
