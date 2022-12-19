package com.practice;
public class Main
{
        public static void main(String[] args)
        {
            System.out.println("Hello world!");
            Car myNewCar = new Car()
            {
                @Override
                public boolean CanSeat(int seats)
                {
                    seats = 6 ;
                    return super.CanSeat(seats);
                }
            };
            Car myOldCar = new Car(5);
            System.out.println(myNewCar.get());
            System.out.println(myOldCar.get());
            //myNewCar = myOldCar ;
            System.out.println(myNewCar.get());
            System.out.println(myNewCar.CanSeat(4));
            myOldCar.weight = 500 ;
            myNewCar.weight = 400 ;
            System.out.println(myNewCar.IsHeavy(myOldCar,myNewCar));
            // myOldCar.roadSpeed = 130 ; not possible as variable is final
            Car.topSpeed = 150 ;
            myOldCar.topSpeed = 130 ;
            myNewCar.topSpeed = 180 ;
            System.out.println(Car.topSpeed); //180
            System.out.println(myOldCar.topSpeed); //180
            System.out.println(myNewCar.topSpeed); //180
            try
            {
              //myOldCar = null ; // NullPointerException
            } catch (Exception e)
            {
                System.out.println("Null Pointer Exception");
            }
            finally
            {
                System.out.println(myNewCar.get());
                System.out.println(myOldCar.get());// Gives null pointer Exception
                System.out.println(myNewCar.get()); // Cannot be invoked as previous statement is an exception

            }
            A obj = new A ();
            obj.a = 20 ;
            obj.isName() ;
            System.out.println(obj.mileage);
            System.out.println(obj.n);
            // System.out.println(obj.m); private variable
            obj.CanSeat(4) ;
        }
}
