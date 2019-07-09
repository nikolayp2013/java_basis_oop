package ru.javabegin.training.fastjava2.shop;

import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.VisitorInterface;
import ru.javabegin.training.fastjava2.shop.service.Administrator;

import java.io.File;
import java.util.ArrayList;

public class SalesRoom {

    public static final String SHOP_NAME = "technodom";

    private ArrayList<DepartmentInterface> departmentList;// в каждом департаменте имеются свои сотрудники

    private ArrayList<VisitorInterface> visitorList;

    private Administrator administrator;



}
