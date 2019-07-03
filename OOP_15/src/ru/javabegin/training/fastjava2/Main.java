package ru.javabegin.training.fastjava2;

import ru.javabegin.training.fastjava2.objects.Phone;

public class Main {

    public static void main(String[] args) {
        Phone phone = new Phone(1024,"Samsung","GSM");
        //phone.setName("iPhone");

        System.out.println("phone.getType() = " + phone.getType());
        System.out.println("phone.getName() = " + phone.getName());

        phone.setName("iPhone");
    }
}
