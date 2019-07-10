package ru.javabegin.training.fastjava2.shop.interfaces;

import ru.javabegin.training.fastjava2.shop.department.AbstractDepartment;

public interface EmployeeInterface{

    String getName();

    DepartmentInterface getDepartment();

    boolean isFree();

    void setDepartment(DepartmentInterface department);
}
