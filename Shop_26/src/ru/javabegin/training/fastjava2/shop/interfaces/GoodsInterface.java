package ru.javabegin.training.fastjava2.shop.interfaces;

import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;

public interface GoodsInterface {

    double getPrice();

    boolean hasGuarantee();

    String getName();

    DepartmentInterface getDepartment();

    String getCompany();

}
