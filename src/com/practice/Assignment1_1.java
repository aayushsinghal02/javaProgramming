package src.com.practice;

import java.util.Scanner;

public class Assignment1_1
{
    public static void main (String args[])
    {
        char nptel[] = {'N','P','T','E','L'};
        System.out.println(nptel[0]+nptel[nptel.length-1]); //154
        System.out.println(""+nptel[0]+nptel[nptel.length-1]); // NP
        System.out.println("Final cannot be used as variable name but calloc,malloc and identifier can be used");
        int [] a ;
        int b [] ;
        int [] c = new int [20] ;
       // int [] [] d = new int [20] ;
        int [] [] e = new int [30] [] ;
        int [] [] f = {{1,2,3},{4,5,6}};
        int x,y,z ;
        System.out.println("Largest Number Amoung All");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt() ;
        y = sc.nextInt() ;
        z = sc.nextInt() ;
        if(x>=y)
        {
            if(x>=z)
            {
                System.out.println(x) ;
            }
            else
            {
                System.out.println(z) ;
            }
        }
        else
        {
            if(y>=z)
            {
                System.out.println(y) ;
            }
            else
            {
                System.out.println(z) ;
            }
        }
        System.out.println("Sum of Even Numbers Divisible by 3");
        int n ;
        n = sc.nextInt();
        int sum = 0 ;
        for(int i=0;i<(2*n);i=i+2)
        {
            if(i%3==0)
            {
                sum = sum + i ;
            }
        }
        System.out.println(sum) ;
        // Armstrong number is a number that is equal to the sum of power of number of its digits.
        System.out.println("Armstrong Number");
        int num ;
        num = sc.nextInt() ;
        int digits = 0 ;
        int temp = num ;
        sum = 0 ;
        while(temp>0)
        {
            digits++ ;
            temp = temp/10;
        }
        temp = num ;
        while(temp>0)
        {
            int p = temp%10 ;
            int t = 1;
            for(int i=0;i<digits;i++)
            {
                t = t*p ;
            }
            sum = sum + t ;
            temp = temp/10 ;
        }
        if(sum==num)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
        System.out.println("find the highest mark and average mark secured by Hari in s number of subjects.");
        int s ;
        s = sc.nextInt() ;
        int [] arr = new int [s];
        double total = 0.0 ;
        for(int i=0;i<s;i++)
        {
            arr[i] = sc.nextInt() ;
            total = total+ arr[i] ;
        }
        int max = arr[0] ;
        for(int i=0;i<s;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i] ;
            }
        }
        System.out.println(max);
        System.out.println(total/s);
        System.out.println("Thanks");
    }
}
