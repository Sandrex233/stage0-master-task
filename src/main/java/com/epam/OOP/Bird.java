package com.epam.OOP;

public class Bird extends Animal{
    public Bird(){
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
//        String paw = numberOfPaws == 1 ? "paw" : "paws";
        return  super.getDescription() +  " Moreover, it has 2 wings and can fly.";
    }
}
