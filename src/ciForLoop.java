import java.util.Scanner;

import static java.lang.Math.pow;

class CompoundInterest
{
    public static void main(String args[])
    {

        double amount=0,principal,rate,time,ci,t=1;



        Scanner sc=new Scanner(System.in);

        System.out.println("enter principal ");

        principal=sc.nextDouble();

        System.out.println("enter rate");

        rate=sc.nextDouble();

        System.out.println("enter time");

        time=sc.nextDouble();

        rate=(1+rate/100);

        for(int i=0;i<time;i++)
            t*=rate;


        amount=principal*t;

        System.out.println("amount="+amount);

        ci=amount-principal;

        System.out.println("compound interest="+ci);

    }
}

