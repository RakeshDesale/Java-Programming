# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), arr[] = new int[n], k, i, sum = 0;
        for(i = 0;i < n;i++)
            arr[i] = obj.nextInt();
        k = obj.nextInt();
        for(i = 0;i < n;i++)
            sum = sum + (arr[i] % k);
        System.out.println(sum);
    }
}
