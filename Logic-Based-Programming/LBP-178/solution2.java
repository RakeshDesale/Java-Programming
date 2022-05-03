# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static boolean totalWt(int W1,int W2,int W3,int L1,int L2){
        return (W1+W2+W3 <= L1+L2);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int W1 = obj.nextInt(), W2 = obj.nextInt(), W3 = obj.nextInt(), L1 = obj.nextInt(), L2 = obj.nextInt();
        System.out.println(totalWt(W1,W2,W3,L1,L2)?"Yes":"No");
    }
}
