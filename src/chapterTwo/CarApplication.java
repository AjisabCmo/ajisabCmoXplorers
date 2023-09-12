package chapterTwo;

import java.util.Scanner;

public class CarApplication{
    public static void main(String[] args){

        Car car1 = new Car("toyota" , "2024", 111.11115);
        Car car2 = new Car("suv" , "2014", 22222.0555555);

        System.out.println(car1.getPrice());
        System.out.println(car2.getPrice());

        System.out.println();

        System.out.println(car1.firstCar());


        System.out.println(car2.secondCar());

    }


}

