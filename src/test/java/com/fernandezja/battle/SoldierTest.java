package com.fernandezja.battle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class SoldierTest 
{
    @Test
    public void soldier_simple_test()
    {
        Soldier soldier1 = new Soldier();
        soldier1.setName("Soldier 1");

        assertEquals("Soldier 1", soldier1.getName());
    }

    @Test
    public void soldier_print()
    {
        Soldier soldier1 = new Soldier();
        soldier1.setName("Soldier 1");

        assertEquals("generic print", soldier1.print());
    }


    @Test
    public void soldier_with_a_weapon_knife()
    {
        Soldier soldier1 = new Soldier();
        soldier1.setName("Soldier 1");
        soldier1.setWeapon(new Knife());

        assertEquals("Knife", soldier1.getWeapon().getName());
        assertEquals(0.5f, soldier1.getWeapon().getDamage(), 0.0f);
    }
}
