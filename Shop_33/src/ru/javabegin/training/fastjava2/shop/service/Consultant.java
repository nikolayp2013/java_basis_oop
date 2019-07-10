package ru.javabegin.training.fastjava2.shop.service;

import ru.javabegin.training.fastjava2.shop.department.AbstractDepartment;
import ru.javabegin.training.fastjava2.shop.enums.ConsultResult;
import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.VisitorInterface;

public class Consultant extends AbstractEmployee {


    public Consultant(String name) {
        super(name);
    }

    public ConsultResult consult(VisitorInterface visitor){
        super.setFree(false);

        // здесь должна быть логика купит или пойдет домой

        return ConsultResult.BUY;
    }


    public void send(){

    }


    @Override
    public void setDepartment(DepartmentInterface department) {

    }
}
