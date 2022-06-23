# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int sumOfQuotient(int n, int arr[], int k){
        int i, sum = 0;
        for(i = 0;i < n;i++)
            sum = sum + (arr[i] / k);
        return sum;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), arr[] = new int[n], k, i;
        for(i = 0;i < n;i++)
            arr[i] = obj.nextInt();
        k = obj.nextInt();
        System.out.println(sumOfQuotient(n,arr,k));
    }
}
