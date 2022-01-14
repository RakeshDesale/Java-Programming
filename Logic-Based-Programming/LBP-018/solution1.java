# Without using Function:

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String month=obj.nextLine();
        int day=obj.nextInt();
        if (month.equals("july") && day==5)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
