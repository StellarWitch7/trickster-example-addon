package com.example.modid.spell.blunder;

import dev.enjarai.trickster.spell.blunder.TrickBlunderException;
import dev.enjarai.trickster.spell.trick.Trick;
import net.minecraft.text.MutableText;

public class ExampleBlunder extends TrickBlunderException {

    public ExampleBlunder(Trick<?> source) {
        super(source);
    }

    @Override
    public MutableText createMessage() {
        return super.createMessage().append("This is an example blunder, no idea what happened");
    }
}
