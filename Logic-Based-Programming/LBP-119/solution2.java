# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static LinkedList insertElement(LinkedList ll, int ele){
        ll.addFirst(ele);
        return ll;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i;
        LinkedList<Integer> ll = new <Integer>LinkedList();
        for(i=0;i<n;i++)
            ll.add(obj.nextInt());
        int ele = obj.nextInt();
        ll = insertElement(ll,ele);
        for(Object o:ll.toArray())
            System.out.print((Integer)o+" ");
    }
}
