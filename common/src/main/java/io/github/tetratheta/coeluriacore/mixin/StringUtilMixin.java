package io.github.tetratheta.coeluriacore.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

// Original: https://github.com/Ramixin/SlashLength/blob/master/src/main/java/net/ramgames/nccl/client/mixins/StringHelperMixin.java
@Mixin(net.minecraft.util.StringUtil.class)
public class StringUtilMixin {

  @WrapOperation(method = "trimChatMessage", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/StringUtil;truncateStringIfNecessary(Ljava/lang/String;IZ)Ljava/lang/String;"))
  private static String removeTruncationLimitIfCommand(String text, int maxLength, boolean addEllipsis, Operation<String> original) {
    if (text.startsWith("/")) {
      return text;
    }
    return original.call(text, maxLength, addEllipsis);
  }
}
