# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean digit7Present(int n){
        while(n!=0){
            if(n%10==7)
                return true;
            n = n/10;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,arr[] = new int[n];
        boolean flag = false;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            if(digit7Present(arr[i])){
                flag = true;
                break;
            }
        }
        System.out.println((flag)?"Boom!":"there is no 7 in the array");
    }
}
