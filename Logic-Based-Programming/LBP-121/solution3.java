# Another Way Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static LinkedList delFirstEle(LinkedList ll, int n){
        ll.removeFirst();
        return ll;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(),i,ele;
        LinkedList<Integer> ll = new <Integer>LinkedList();
        for(i=0;i<n;i++)
            ll.add(obj.nextInt());
        ll = delFirstEle(ll,n);
        for(Object o:ll.toArray())
            System.out.print((Integer)o+" ");
    }
}
