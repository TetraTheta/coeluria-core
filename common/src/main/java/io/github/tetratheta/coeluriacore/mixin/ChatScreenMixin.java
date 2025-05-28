package io.github.tetratheta.coeluriacore.mixin;

import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.ChatScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

// Orignal: https://github.com/Ramixin/SlashLength/blob/master/src/main/java/net/ramgames/nccl/client/mixins/ChatScreenMixin.java
@Mixin(ChatScreen.class)
public class ChatScreenMixin {
  @Shadow
  protected EditBox input;

  @SuppressWarnings("DiscouragedShift")
  @Inject(method = "onEdited", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/components/CommandSuggestions;setAllowSuggestions(Z)V", shift = At.Shift.BEFORE))
  private void modifyChatLengthIfCommand(String chatText, CallbackInfo ci) {
    // chatText == this.input.getValue()
    if (this.input.getValue().startsWith("/")) this.input.setMaxLength(Integer.MAX_VALUE);
    else this.input.setMaxLength(256);
  }
}
