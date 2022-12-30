
https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

import java.text.NumberFormat;
import java.util.Scanner;

public class JavaOutputFormatting{
    public static void main(String []argh){
    	Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%3d%n",s1,x);
        System.out.println("================================");

}
}
