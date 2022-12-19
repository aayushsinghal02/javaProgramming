package com.practice;
public class Car
{
    final String COMPANY_NAME = "ZS Associates";
    private int m ;
    protected int n ;
    public int a = 5 ;
    final int roadSpeed = 50;
    static int topSpeed = 200 ;
    private int seats;
    private int wheels ;
    double weight ;
    double mileage ;
    Car()
    {
        this.mileage = 0 ;
        System.out.println((int)this.mileage);
    }
    Car (int seats)
    {
        this() ;
        this.seats = seats ;
        set(seats);
        System.out.println(this.seats);
        System.out.println(this.mileage);
    }
    public void set (int seats)
    {
        this.seats = seats ;
        int temp = get();
        System.out.println(temp);
        return ;
    }
    public int get ()
    {
        return this.seats;
    }
    public boolean CanSeat (int seats)
    {
        if(this.seats<= seats)
        {
            return true ;
        }
        return false ;
    }
    public boolean IsHeavy (Car c1, Car c2)
    {
        if(c1.weight >= c2.weight)
        {
            return true ;
        }
        return false ;
    }
}

