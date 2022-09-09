package com.fernandezja.battle;



public class Soldier 
                extends ResourceBase
{
    private WeaponBase weapon;

    public WeaponBase getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponBase value) {
        this.weapon = value;
    }

    public void attack(ResourceBase target) {
        if (getWeapon() != null) {
            super.attack(target, getWeapon().getDamage());
        } else {
            super.attack(target);
        }
    }

}
