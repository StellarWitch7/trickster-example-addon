package com.example.modid;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import nl.enjarai.cicada.api.util.ProperLogger;

import org.slf4j.Logger;

import com.example.modid.spell.trick.ModTricks;

public class Example implements ModInitializer {
    public static final String MOD_ID = "modid";
    public static final Logger LOGGER = ProperLogger.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        ModTricks.register();
    }

    public static Identifier id(String... path) {
        return Identifier.of(MOD_ID, String.join("/", path));
    }
}
