package com.lambdaschool;

public abstract class Animal
{
    private static int maxId = 0;
    private int id;
    private String name;
    private int year;

    public Animal(String name, int year)
    {
        id = maxId++;
        this.name = name;
        this.year = year;
    }

    public void eat()
    {
        System.out.println("Animal eats.");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public abstract String move();
    public abstract String breathe();
    public abstract String reproduce();
}
