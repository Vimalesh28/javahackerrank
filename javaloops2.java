https://www.hackerrank.com/challenges/java-loops-i/submissions/code/307347647

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class javaloops2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int k=0;
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i=1;i<=10;i++){
             k=N*i;
            System.out.println(N+" x "+ i+" = "+ k);
        }
        bufferedReader.close();
    }
}
