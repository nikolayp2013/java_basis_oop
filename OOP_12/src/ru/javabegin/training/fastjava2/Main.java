package ru.javabegin.training.fastjava2;

import ru.javabegin.training.fastjava2.objects.Car;
import ru.javabegin.training.fastjava2.objects.Door;

public class Main {

    public static void main(String[] args) {
	    Car car = new Car();
	    //car.setName("Toyota");

        System.out.println("car.getName() = " + car.getName());
        
        Door door = new Door();
        door.setColor("white");
        System.out.println("door.getColor() = " + door.getColor());
    }
}
