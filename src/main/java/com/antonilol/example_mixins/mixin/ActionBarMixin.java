package com.antonilol.example_mixins.mixin;

import static com.antonilol.example_mixins.Main.chat;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.text.Text;

@Mixin(InGameHud.class)
public class ActionBarMixin {
	
	@Inject(at = @At("HEAD"), method = "Lnet/minecraft/client/gui/hud/InGameHud;setOverlayMessage(Lnet/minecraft/text/Text;Z)V")
	private void sendMessage(Text message, boolean tinted, CallbackInfo info) {
		chat("actionbar message: " + message.asString());
		chat("tinted: " + tinted);
	}
}
