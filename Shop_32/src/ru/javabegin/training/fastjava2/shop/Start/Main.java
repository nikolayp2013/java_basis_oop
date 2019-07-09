package ru.javabegin.training.fastjava2.shop.Start;

import ru.javabegin.training.fastjava2.shop.bank.Sberbank;
import ru.javabegin.training.fastjava2.shop.bank.VTB;

public class Main {

    public static void main(String[] args) {
//        Televisor televisor = new Televisor("Samsung");
//
//        Subwoofer subwoofer = new Subwoofer("Microlab");
//
//        Computer computer = new Computer("MacBook");
//        Computer computer2 = new Computer("Asus");
//
//        CommonVisitor commonVisitor = new CommonVisitor();
//
//        commonVisitor.buy(televisor);
//        commonVisitor.buy(computer);
//        commonVisitor.buy(computer2);
//        commonVisitor.buy(computer2);
//        commonVisitor.buy(subwoofer);


        Sberbank sberbank = new Sberbank("Sberbank","test desc");
        sberbank.checkInfo(true);
        sberbank.checkInfo();
        sberbank.checkInfo();

        VTB vtb = new VTB("VTB","test desc");
        vtb.checkInfo();
        vtb.checkInfo();


        System.out.println("asDASD");



    }
}
