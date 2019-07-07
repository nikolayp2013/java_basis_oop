package ru.javabegin.training.fastjava2.shop;

import ru.javabegin.training.fastjava2.shop.client.BaseVisitor;
import ru.javabegin.training.fastjava2.shop.department.BaseDepartment;
import ru.javabegin.training.fastjava2.shop.service.Administrator;

import java.util.ArrayList;

public class SalesRoom {

    private ArrayList<BaseDepartment> departmentList;// в каждом департаменте имеются свои сотрудники

    private String name;

    private ArrayList<BaseVisitor> visitorList;

    private Administrator administrator;

}
