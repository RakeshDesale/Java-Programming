# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int checkBirthday(String month,int day){
        return (month.equals("july")&&day==5)?1:0;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String month=obj.nextLine();
        int day=obj.nextInt();
        System.out.println(checkBirthday(month,day));
    }
}
