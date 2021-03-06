package com.shag.SOLID;

public class TestModel {
    private int id;
    private String name;

    public TestModel() {

    }

    @Override
    public String toString() {
        return "id:" + id + "name:" + name;
    }

    public TestModel(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
