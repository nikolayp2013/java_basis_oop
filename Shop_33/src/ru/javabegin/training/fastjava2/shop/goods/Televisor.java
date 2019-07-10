package ru.javabegin.training.fastjava2.shop.goods;

public class Televisor extends ElectronicDevice{


    public Televisor(String name) {
        super(name);
    }

    public Televisor(double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name, company);
    }

    public Televisor() {
    }

    public void selectChannel(){

    }



}
