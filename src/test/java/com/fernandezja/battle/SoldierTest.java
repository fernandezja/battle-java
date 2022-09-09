package com.fernandezja.battle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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
        assertTrue(soldier1.isLive());
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


    @Test
    public void soldier_with_a_weapon_machinegun()
    {
        Soldier soldier1 = new Soldier();
        soldier1.setName("Soldier 1");
        soldier1.setWeapon(new MachineGun());

        assertEquals("Machine Gun", soldier1.getWeapon().getName());
        assertEquals(1.0f, soldier1.getWeapon().getDamage(), 0.0f);
    }


    @Test
    public void soldier_attack_another_soldier()
    {
        Soldier soldier1 = new Soldier();
        soldier1.setName("Soldier 1");
        soldier1.setWeapon(new MachineGun());

        Soldier soldier2 = new Soldier();
        soldier2.setName("Soldier 2");

        assertTrue(soldier2.isLive());

        soldier1.attack(soldier2);

        assertFalse(soldier2.isLive());
    }


    @Test
    public void soldier_attack_another_soldier_with_knife()
    {
        Soldier soldier1 = new Soldier();
        soldier1.setName("Soldier 1");
        soldier1.setWeapon(new Knife());

        Soldier soldier2 = new Soldier();
        soldier2.setName("Soldier 2");

        assertTrue(soldier2.isLive());

        soldier1.attack(soldier2);

        assertTrue(soldier2.isLive());
        assertEquals(0.5f, soldier2.getLife(), 0.0f);
    }


    @Test
    public void soldier_attack_another_soldier_with_machinegun()
    {
        Soldier soldier1 = new Soldier();
        soldier1.setName("Soldier 1");
        soldier1.setWeapon(new MachineGun());

        Soldier soldier2 = new Soldier();
        soldier2.setName("Soldier 2");

        assertTrue(soldier2.isLive());

        soldier1.attack(soldier2);

        assertFalse(soldier2.isLive());
    }
}
