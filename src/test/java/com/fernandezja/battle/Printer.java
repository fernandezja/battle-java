package com.fernandezja.battle;

import com.fernandezja.battle.interfaces.IPrintable;

public class Printer {
    
    public String print(IPrintable obj){
        return obj.print();
    }
}
