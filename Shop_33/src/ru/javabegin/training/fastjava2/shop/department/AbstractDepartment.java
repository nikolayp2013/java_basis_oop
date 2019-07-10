package ru.javabegin.training.fastjava2.shop.department;

import ru.javabegin.training.fastjava2.shop.interfaces.DepartmentInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.EmployeeInterface;
import ru.javabegin.training.fastjava2.shop.interfaces.GoodsInterface;

import java.util.ArrayList;


public abstract class AbstractDepartment implements DepartmentInterface{

    public AbstractDepartment(String name) {
        this.name = name;
    }

    public AbstractDepartment() {
    }

    private String name;
    private ArrayList<EmployeeInterface> employeeList = new ArrayList<EmployeeInterface>();
    private ArrayList<GoodsInterface> goodsList = new ArrayList<GoodsInterface>();

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(ArrayList<GoodsInterface> goodsList) {
        this.goodsList = goodsList;
    }

    public void addEmployee(EmployeeInterface employee) {
        employee.setDepartment(this);
        employeeList.add(employee);
    }

    public void addGoods(GoodsInterface goods) {
        goods.setDepartmends(this);
        goodsList.add(goods);
    }

}
