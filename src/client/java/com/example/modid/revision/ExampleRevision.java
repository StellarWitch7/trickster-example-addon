package com.example.modid.revision;

import dev.enjarai.trickster.revision.Revision;
import dev.enjarai.trickster.revision.RevisionContext;
import dev.enjarai.trickster.spell.Pattern;
import dev.enjarai.trickster.spell.PatternGlyph;
import dev.enjarai.trickster.spell.SpellPart;

public class ExampleRevision implements Revision {
    @Override
    public Pattern pattern() {
        return Pattern.of(2, 4, 6);
    }

    @Override
    public SpellPart apply(RevisionContext ctx, SpellPart root, SpellPart drawingPart) {
        drawingPart.glyph = new PatternGlyph();
        return root;
    }
}
