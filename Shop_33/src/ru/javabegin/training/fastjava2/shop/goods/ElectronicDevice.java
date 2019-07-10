package ru.javabegin.training.fastjava2.shop.goods;

import ru.javabegin.training.fastjava2.shop.department.AbstractDepartment;
import ru.javabegin.training.fastjava2.shop.interfaces.ElectronicDeviceInterface;

public class ElectronicDevice extends AbstractGoods implements ElectronicDeviceInterface{


    public ElectronicDevice() {
    }

    public ElectronicDevice(String name) {
        super(name);
    }

    public ElectronicDevice(double price, boolean hasGuarantee, String name, String company) {
        super(price, hasGuarantee, name, company);
    }

    @Override
    public void on() {
        // общая реализация
    }

    @Override
    public void off() {
        // общая реализация
    }

    @Override
    public void setDepartmends(AbstractDepartment abstractDepartment) {

    }
}
