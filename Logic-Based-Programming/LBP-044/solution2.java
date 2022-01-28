# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),i,sumeven=0,sumodd=0;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
            arr[i]=obj.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]%2==0)
                sumeven=sumeven+arr[i];
            else
                sumodd=sumodd+arr[i];
        }
        System.out.println(Math.abs(sumeven-sumodd));
    }
}
