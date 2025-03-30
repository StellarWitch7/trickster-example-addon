package com.example.modid.revision;

import dev.enjarai.trickster.revision.Revision;
import dev.enjarai.trickster.revision.Revisions;

public class ModRevisions {
    public static final Revision EXAMPLE = Revisions.register(new ExampleRevision());

    public static void register() {
        // init the class
    }
}
