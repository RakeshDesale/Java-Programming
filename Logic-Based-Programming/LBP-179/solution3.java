# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,j = 0,k = 0,arr[] = new int[n],even[] = new int[n/2],odd[] = new int[n/2];
        for(i=0;i<n;i++)
            arr[i] = obj.nextInt();
        Arrays.sort(arr);
        for(i=0;i<n;i++){
            if(arr[i]%2 == 0)
                even[j++] = arr[i];
            else
                odd[k++] = arr[i];
        }
        for(i=0;i<n/2;i++)
            System.out.print(even[i]+" "+odd[i]+" ");
    }
}
