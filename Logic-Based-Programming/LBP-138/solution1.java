# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,countEven = 0,countOdd = 0;
        int arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++){
            if(arr[i]%2==0)
                countEven++;
            else
                countOdd++;
        }
        System.out.println(countEven+"\n"+countOdd);
    }
}
