package com.example.modid.spell.trick;

import com.example.modid.Example;

import org.jetbrains.annotations.ApiStatus;
import dev.enjarai.trickster.spell.trick.Trick;
import dev.enjarai.trickster.spell.trick.Tricks;
import net.minecraft.registry.Registry;

public class ModTricks {
    public static final ExampleTrick EXAMPLE = register("example", new ExampleTrick());

    public static void register() {
        // init the class
    }

    @ApiStatus.Internal
    public static <T extends Trick<?>> T register(String path, T trick) {
        return Registry.register(Tricks.REGISTRY, Example.id(path), trick);
    }
}
