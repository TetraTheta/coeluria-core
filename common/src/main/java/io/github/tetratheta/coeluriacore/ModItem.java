package io.github.tetratheta.coeluriacore;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ModItem {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CoeluriaCore.MOD_ID, Registries.ITEM);

  @SuppressWarnings("UnstableApiUsage")
  public static final RegistrySupplier<Item> NETHERITE_SCRAP_SHARD = ITEMS.register("netherite_scrap_shard", () -> new Item(new Item.Properties().arch$tab(ModCreativeTab.COELURIACORE_TAB)));
}
