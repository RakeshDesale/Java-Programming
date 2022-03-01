# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,key,index=-1;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        key = obj.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]==key){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}
