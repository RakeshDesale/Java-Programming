# Without Using Function

# Solution:

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println(obj.nextLine().replaceAll("[aeiou]",""));
    }
}
