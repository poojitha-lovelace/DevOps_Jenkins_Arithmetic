package com.polo.ABC;
import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Add ADD=new Add();
        int res=ADD.add(a, b);
        System.out.println("Addition is "+res);
        Sub SUB=new Sub();
        int r1=SUB.sub(a, b);
        System.out.println("Subtraction is "+r1);
        Mul m=new Mul();
        int r2=m.mul(a, b);
        System.out.println("Multiplication is "+r2);
    }
}
