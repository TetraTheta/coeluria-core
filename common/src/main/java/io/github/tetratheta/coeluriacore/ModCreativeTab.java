package io.github.tetratheta.coeluriacore;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {
  public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(CoeluriaCore.MOD_ID, Registries.CREATIVE_MODE_TAB);

  public static final RegistrySupplier<CreativeModeTab> COELURIACORE_TAB = TABS.register("coeluriacore", () -> CreativeTabRegistry.create(Component.translatable("key.categories.coeluriacore"), () -> new ItemStack(ModItem.NETHERITE_SCRAP_SHARD.get())));
}
