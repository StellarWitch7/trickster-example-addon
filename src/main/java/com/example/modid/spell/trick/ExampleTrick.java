package com.example.modid.spell.trick;

import dev.enjarai.trickster.spell.Fragment;
import dev.enjarai.trickster.spell.Pattern;
import dev.enjarai.trickster.spell.SpellContext;
import dev.enjarai.trickster.spell.fragment.BooleanFragment;
import dev.enjarai.trickster.spell.fragment.FragmentType;
import dev.enjarai.trickster.spell.fragment.NumberFragment;
import dev.enjarai.trickster.spell.trick.Trick;
import dev.enjarai.trickster.spell.type.Signature;

public class ExampleTrick extends Trick<ExampleTrick> {
    public ExampleTrick() {
        super(Pattern.of(3, 4, 5), Signature.of(FragmentType.NUMBER, ExampleTrick::isEven));
    }

    public Fragment isEven(SpellContext ctx, NumberFragment number) {
        return BooleanFragment.of(number.number() % 2 == 0);
    }
}
