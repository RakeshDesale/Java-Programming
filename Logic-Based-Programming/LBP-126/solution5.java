# Core Logic Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void updateElementOnPosition(int arr[], int n, int loc, int ele){
        int i;
        for(i=0;i<n;i++){
            if(i==loc){
                arr[i] = ele;
                break;
            }
        }
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),arr[] = new int[n],i;
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        int loc = obj.nextInt();
        int ele = obj.nextInt();
        updateElementOnPosition(arr,n,loc,ele);
    }
}
