package com.practice;
public class A extends Car
{
    A()
    {
        super() ;
        System.out.println("I am A");
    }
    public int a = 10;
    public void isName()
    {
        System.out.println(this.a);
        System.out.println(super.a);
    }
    @Override
    public boolean CanSeat (int seats)
    {
        set(seats);
        int temp = get() ;
        if(seats == temp)
        {
            return true ;
        }
        return false ;
    }
}
