# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str[] = obj.nextLine().split(" ");
        int i;
        for(i=0;i<str.length;i++){
            if(str[i].length()%2==0)
                System.out.print(str[i]+" ");
        }
    }
}
