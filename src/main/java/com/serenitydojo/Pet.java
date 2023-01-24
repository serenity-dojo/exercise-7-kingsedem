package com.serenitydojo;

public abstract  class Pet {
    private String name;

    public Pet(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    private  int age;

    public int getAge() {
        return age;
    }

    public  abstract String play();
}
