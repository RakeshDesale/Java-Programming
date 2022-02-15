# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String str = obj.nextLine();
        StringBuffer sb = new StringBuffer();
        int n = obj.nextInt();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                sb.append(ch);
        }
        if(n>sb.length())
            System.out.println("invalid");
        else{
            for(int i=0;i<n;i++)
                System.out.print(sb.charAt(i));
        }
    }
}
