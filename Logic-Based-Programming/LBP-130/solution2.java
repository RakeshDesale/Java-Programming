# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void nonRepeatElement(LinkedHashSet h, int n){
        for(Object o:h.toArray())
            System.out.print((Integer)o+" ");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        LinkedHashSet<Integer> h = new LinkedHashSet<Integer>();
        for(i=0;i<n;i++)
            h.add(obj.nextInt());
        nonRepeatElement(h,n);
    }
}
