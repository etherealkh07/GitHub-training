package org.example.constructor;

public class Car {
    String CarName;
    int CarNumber;
    static  int Carprice = 1000;
    int regiNum = 3456;

    Car(String CarName,int CarNumber){
        this.CarName = CarName;
        this.CarNumber = CarNumber;
        Carprice = regiNum;
        ++regiNum;
    }
    public void display()
    {
        System.out.println("Car Name = "+ CarName);
        System.out.println("Car Number = " + CarNumber);
        System.out.println("Car Price = "+ Carprice);
    }

    public static void main(String[] args) {
        Car c = new Car("BME", 23456);
        Car c1 = new Car("HGF", 9876);
         c.display();
         c1.display();
    }
}
