package com.example.modid;

import com.example.modid.revision.ModRevisions;

import net.fabricmc.api.ClientModInitializer;

public class ExampleClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.

        ModRevisions.register();
    }
}
