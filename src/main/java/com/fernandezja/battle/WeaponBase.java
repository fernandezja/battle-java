package com.fernandezja.battle;



public abstract class WeaponBase 
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private float damage;

    public float getDamage() {
        return damage;
    }

    public void setDamage(float value) {
        this.damage = value;
    }

    public WeaponBase(String name, float damage) {
        super();
        setName(name);
        setDamage(damage);
    }

}
