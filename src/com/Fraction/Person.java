package com.Fraction;

public class Person{
    protected String name;
    protected int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "("+name +", " + age+")";
    }
    public String work(){
        return "None";
    }
}

class Employee extends Person{
    private String company;
    public Employee(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    @Override
    public String toString() {
        return "("+name +", " + age+", "+company+")";
    }
    @Override
    public String work(){
        return "Manager";
    }
}