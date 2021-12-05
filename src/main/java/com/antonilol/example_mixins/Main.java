package com.antonilol.example_mixins;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.MessageType;
import net.minecraft.text.LiteralText;

public class Main implements ModInitializer {

	@Override
	public void onInitialize() {
		System.out.println("hi");
	}
	
	public static void chat(String message) {
		MinecraftClient c = MinecraftClient.getInstance();
		if (c == null) {
			return;
		}
		c.inGameHud.addChatMessage(MessageType.SYSTEM, new LiteralText(message), null);
	}
}
