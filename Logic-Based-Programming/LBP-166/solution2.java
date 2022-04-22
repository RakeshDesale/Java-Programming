import java.io.*;
import java.util.*;

public class Solution {
    static void maxRevenue(int arr[][], int n, int m){
        int i,j,max;
        for(i=0;i<n;i++){
            max = arr[i][0];
            for(j=0;j<m;j++){
                if(max<arr[i][j])
                    max = arr[i][j];
            }
            System.out.print(max+" ");
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt(), m = obj.nextInt(), i, j, max, arr[][] = new int[n][m];
        for(i=0;i<n;i++){
            for(j=0;j<m;j++)
                arr[i][j] = obj.nextInt();
        }
        maxRevenue(arr,n,m);
    }
}
