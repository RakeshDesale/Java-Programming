# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        boolean flag = false;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            while(arr[i]!=0){
                if(arr[i]%10==7){
                    flag = true;
                    break;
                }
                arr[i] = arr[i]/10;
            }
        }
        System.out.println((flag)?"Boom!":"there is no 7 in the array");
    }
}
