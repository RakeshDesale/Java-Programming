# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int salecount=obj.nextInt();
        if (salecount>=30 && salecount<=100){
            if (salecount>=30 && salecount<=50)
                System.out.println("D");
            else if (salecount>=51 && salecount<=60)
                System.out.println("C");
            else if (salecount>=61 && salecount<=80)
                System.out.println("B");
            else
                System.out.println("A");
        }
        else
            System.out.println("invalid");
    }
}
