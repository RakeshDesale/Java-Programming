# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int m = obj.nextInt(), n = obj.nextInt(), arr[] = new int[n+1],i;
        for(i=1;i<=n;i++)
            arr[i] = m*i;
        for(i=1;i<=n;i++)
            System.out.print(arr[i]+" ");
    }
}
