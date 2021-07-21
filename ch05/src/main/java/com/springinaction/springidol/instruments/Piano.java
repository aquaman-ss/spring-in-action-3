package com.springinaction.springidol.instruments;

import com.springinaction.springidol.qualifiers.SkipIt;

@SkipIt
public class Piano implements Instrument {

    public Piano() {}

    public void play() { System.out.println("PLINK PLINK PLINK"); }
}
