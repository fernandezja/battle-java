package com.fernandezja.battle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class VehiclesTest 
{
    @Test
    public void tank_simple_test()
    {
        Tank tank1 = new Tank();
        tank1.setName("Tank 1");

        assertEquals("Tank 1", tank1.getName());
    }

    @Test
    public void ship_simple_test()
    {
        Ship ship1 = new Ship();
        ship1.setName("Ship 1");

        assertEquals("Ship 1", ship1.getName());
    }

}
