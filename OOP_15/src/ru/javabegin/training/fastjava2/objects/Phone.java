package ru.javabegin.training.fastjava2.objects;

public class Phone {

    private int ram;
    private String name;
    private String type;
    private String color;
    private int size;

    public Phone() {
    }

    public Phone(int ram, String name, String type) {
        this.ram = ram;
        this.name = name;
        this.type = type;
    }

    public Phone(int ram, String name, String type, String color, int size) {
        this.ram = ram;
        this.name = name;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
