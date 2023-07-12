package java;

import java.util.Scanner;

public class FibonacciSeries 
{
    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the number of terms in the series");
        int n = sc.nextInt(); 
        
        int fNum = 0, sNum = 1;
        System.out.print("Fibonacci Series: "+fNum+" "+sNum);
        for (int i = 0; i < n; i++) 
        {
            int nextNum = fNum + sNum;
            System.out.print(" " + nextNum);
            fNum = sNum;
            sNum = nextNum;
        }
    }
}