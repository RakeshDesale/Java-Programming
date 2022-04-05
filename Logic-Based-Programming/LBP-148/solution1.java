# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int size = obj.nextInt(),i,arr[] = new int[size],last;
        for(i=0;i<size;i++)
            arr[i] = obj.nextInt();
        last = obj.nextInt();
        if(last>size)
            System.out.println(0);
        else{
            for(i=size-last;i<size;i++)
                System.out.print(arr[i]+" ");
        }
    }
}
