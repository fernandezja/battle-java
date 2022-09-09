package com.fernandezja.battle;

import com.fernandezja.battle.interfaces.IPrintable;

public class Soldier 
        implements IPrintable
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String print() {
       
        return "generic print";
    }

    public String printWithOutTest() {
       
        return "printWithOutTest ";
    }

}
