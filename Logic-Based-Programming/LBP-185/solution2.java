# Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {
    static int highSaving(int ms1, int me1, int ms2, int me2, int ms3, int me3){
        int sav1, sav2, sav3;
        sav1 = ms1 - me1;
        sav2 = ms2 - me2;
        sav3 = ms3 - me3;
        return ((sav1>sav2 && sav1>sav3)?sav1:(sav2>sav3)?sav2:sav3);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ms1 = obj.nextInt(),me1 = obj.nextInt(),ms2 = obj.nextInt(),me2 = obj.nextInt(),ms3 = obj.nextInt(),me3 = obj.nextInt();
        System.out.println(highSaving(ms1,me1,ms2,me2,ms3,me3));
    }
}
