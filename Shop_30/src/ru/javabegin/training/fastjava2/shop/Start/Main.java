package ru.javabegin.training.fastjava2.shop.Start;

import ru.javabegin.training.fastjava2.shop.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop.goods.Computer;
import ru.javabegin.training.fastjava2.shop.goods.Subwoofer;
import ru.javabegin.training.fastjava2.shop.goods.Televisor;
import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

public class Main {

    public static void main(String[] args) {
//        Televisor televisor = new Televisor("Samsung");

        GoodsInterface goods = new Televisor("Samsung");

//        Televisor t = (Televisor)goods;

        ((Televisor)goods).selectChannel();

/*        Subwoofer subwoofer = new Subwoofer("Microlab");

        Computer computer = new Computer("MacBook");
        Computer computer2 = new Computer("Asus");*/

        CommonVisitor commonVisitor = new CommonVisitor();

        commonVisitor.buy(goods);
   /*     commonVisitor.buy(computer);
        commonVisitor.buy(computer2);
        commonVisitor.buy(computer2);
        commonVisitor.buy(subwoofer);*/

    }
}
