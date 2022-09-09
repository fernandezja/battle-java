package com.fernandezja.battle;

import com.fernandezja.battle.interfaces.IPrintable;

public abstract class ResourceBase 
                        implements IPrintable
{

    public ResourceBase() {
        super();
        setLife(1.0f);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    private float life;

    public float getLife() {
        return life;
    }

    private void setLife(float value) {
        this.life = value;
    }

    public boolean isLive() {
        return getLife() > 0;
    }


    public void attack(ResourceBase target) {
        target.setLife(target.getLife() - 1);
    }

    public void attackReception(float damage) {
        setLife(getLife() - damage);
    }


    @Override
    public String print() {
       
        return "generic print";
    }

    public String printWithOutTest() {
       
        return "printWithOutTest ";
    }
}
