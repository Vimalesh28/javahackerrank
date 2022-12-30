
https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

import java.util.*;
import java.io.*;
import java.lang.Math.*;
public class javaloops{
    public static void main(String []arg){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int temp = a;
            for(int j=0;j<n;j++)
            {
                temp+=(Math.pow(2,j)*b);
                System.out.print(temp+" ");
            }
            System.out.println();
        }
        in.close();
    }
}