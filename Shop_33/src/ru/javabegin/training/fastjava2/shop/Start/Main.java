package ru.javabegin.training.fastjava2.shop.Start;

import ru.javabegin.training.fastjava2.shop.SalesRoom;
import ru.javabegin.training.fastjava2.shop.client.CommonVisitor;
import ru.javabegin.training.fastjava2.shop.client.VipVisitor;
import ru.javabegin.training.fastjava2.shop.department.ElectronicDepartment;
import ru.javabegin.training.fastjava2.shop.department.GameDepartment;
import ru.javabegin.training.fastjava2.shop.enums.ConsultResult;
import ru.javabegin.training.fastjava2.shop.goods.Computer;
import ru.javabegin.training.fastjava2.shop.goods.GameConsole;
import ru.javabegin.training.fastjava2.shop.goods.Televisor;
import ru.javabegin.training.fastjava2.shop.service.Administrator;
import ru.javabegin.training.fastjava2.shop.service.Consultant;

public class Main {

    public static void main(String[] args) { imitateShopWorking(); }

    public static void imitateShopWorking() {

        SalesRoom salesRoom = new SalesRoom(); // создаем торговый зал

        // создаем администратора всего торгового зала
        Administrator administrator = new Administrator(salesRoom);

        // создаем два департамента (отдела)
        ElectronicDepartment electronicDepartment = new ElectronicDepartment();
        GameDepartment gameDepartment = new GameDepartment();

        // добавляем департаменты в торговый зал
        salesRoom.addDepartment(electronicDepartment);
        salesRoom.addDepartment(gameDepartment);

        // добавляем сотрудников в каждый отдел
        Consultant consultant1 = new Consultant("Джон");
        consultant1.setFree(true);

        Consultant consultant2 = new Consultant("Анна");

        electronicDepartment.addEmployee(consultant1);
        electronicDepartment.addEmployee(consultant1);

        // создаем товары для отделов
        Computer computer = new Computer(200, true, "ZenBook", "Asus", 2048);
        Televisor televisor = new Televisor(1000,false,"SmartTV","Samsung");
        GameConsole xbox = new GameConsole("XBOX", 1024);

        // добавляем товары в отделы
        electronicDepartment.addGoods(televisor);
        electronicDepartment.addGoods(computer);
        gameDepartment.addGoods(xbox);

        // создаем покупателей
        CommonVisitor visitor1 = new CommonVisitor("Джон");
        VipVisitor vipVisitor1 = new VipVisitor("Джон", 50);


        // ищем свободного консультанта из нужного отдела
        ConsultResult consultResult = administrator.getFreeConsultant(electronicDepartment).consult(visitor1);

        switch (consultResult) {
            case BUY:
                visitor1.buy(televisor);
                break;
            case EXIT:
                break;
        }

    }
}
