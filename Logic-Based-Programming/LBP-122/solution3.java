# Another Approach Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static LinkedList delLastEle(LinkedList ll){
        ll.removeLast();
        return ll;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        LinkedList<Integer> ll = new <Integer>LinkedList();
        for(i=0;i<n;i++)
            ll.add(obj.nextInt());
        ll = delLastEle(ll);
        for(Object o:ll.toArray())
            System.out.print((Integer)o+" ");        

    }
}
