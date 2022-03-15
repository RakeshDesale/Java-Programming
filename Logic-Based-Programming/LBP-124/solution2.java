# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static void delElement(LinkedList ll, int e){
        if(ll.remove(new Integer(e))){
            for(Object o:ll.toArray())
                System.out.print((Integer)o+" ");
        }
        else
            System.out.println(-1);        
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for(i=0;i<n;i++)
            ll.add(obj.nextInt());
        int e = obj.nextInt();
        delElement(ll,e);
    }
}
