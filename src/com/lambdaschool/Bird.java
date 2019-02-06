package com.lambdaschool;

public class Bird extends Animal
{
    private String move = "Fly";
    private String breathe = "Lungs";
    private String reproduce = "Eggs";

    public Bird(String name, int year)
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
