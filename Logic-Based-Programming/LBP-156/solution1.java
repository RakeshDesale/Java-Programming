# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        int n = obj.nextInt(),i,arr[] = new int[n];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        for(i=0;i<n;i++)
            System.out.print(str.charAt(arr[i]));
    }
}
