package io.github.tetratheta.coeluriacore.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// TODO: Figure out only modify EditBox in ChatScreen
@Mixin(EditBox.class)
public class EditBoxMixin {
  @Shadow
  private int maxLength;

  @Inject(method = "insertText", at = @At("HEAD"))
  private void onInsertText(String textToWrite, CallbackInfo ci) {
    if (Minecraft.getInstance().screen instanceof ChatScreen) {
      EditBox box = (EditBox) (Object) this;
      boolean isCommand = textToWrite.startsWith("/") || box.getValue().startsWith("/");

      if (isCommand) this.maxLength = Integer.MAX_VALUE;
    }
  }
}
