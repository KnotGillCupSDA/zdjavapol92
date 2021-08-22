package com.sda.advanced.fromthergroups.zad18;

import java.util.Objects;

public class Computer {

    private String cpu;
    private int ram;
    private String name;
    private String model;

    public Computer(String cpu, int ram, String name, String model) {
        this.cpu = cpu;
        this.ram = ram;
        this.name = name;
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram && Objects.equals(cpu, computer.cpu) && Objects.equals(name, computer.name) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, ram, name, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
