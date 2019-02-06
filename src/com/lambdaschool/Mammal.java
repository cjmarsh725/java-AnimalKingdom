package com.lambdaschool;

public class Mammal extends Animal
{
    private String move = "Walk";
    private String breathe = "Lungs";
    private String reproduce = "Live Births";

    public Mammal(String name, int year)
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
