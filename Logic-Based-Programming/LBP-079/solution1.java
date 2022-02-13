# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str[] = obj.nextLine().split(" ");
        System.out.print(str[str.length-1]+" ");
        for(int i=str.length-2;i>=1;i--)
            System.out.print(new StringBuffer(str[i]).reverse()+" ");
        System.out.print(str[0]);
    }
}
