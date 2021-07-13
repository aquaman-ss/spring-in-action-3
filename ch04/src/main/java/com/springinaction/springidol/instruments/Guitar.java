package com.springinaction.springidol.instruments;

import com.springinaction.springidol.qualifiers.StringedInstrument;
import com.springinaction.springidol.qualifiers.Strummed;

@Strummed
@StringedInstrument
public class Guitar implements Instrument {

    public Guitar() {
    }

    public void play() {
        System.out.println("STRUM STRUM STRUM");
    }
}
/*Если класс Guitar окажется единственным с аннотациями @Strummed и @StringedInstrument,
тогда в свойство instrument будет внедрен компонент этого класса.*/
