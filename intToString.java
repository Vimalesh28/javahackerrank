package hackercode;
https://www.hackerrank.com/challenges/java-int-to-string/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class intToString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n<=100){
            try{
            String s=Integer.toString(n);
                System.out.print("Good job");
            }
            catch(Exception e){
             System.out.print("Wrong Answer");   
            }
        }}
    }
