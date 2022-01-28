# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int diff(int arr[], int n){
        int i,sumeven=0,sumodd=0;
        for (i=0;i<n;i++){
            if(arr[i]%2==0)
                sumeven=sumeven+arr[i];
            else
                sumodd=sumodd+arr[i];
        }
        return sumeven-sumodd;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt(),i;
        int arr[]=new int[n];
        for (i=0;i<n;i++)
            arr[i]=obj.nextInt();
        System.out.println(Math.abs(diff(arr,n)));
    }
}
