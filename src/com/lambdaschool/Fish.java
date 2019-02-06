package com.lambdaschool;

public class Fish extends Animal
{
    private String move = "Swim";
    private String breathe = "Gills";
    private String reproduce = "Eggs";

    public Fish(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String move()
    {
        return move;
    }

    @Override
    public String breathe()
    {
        return breathe;
    }

    @Override
    public String reproduce()
    {
        return reproduce;
    }
}
