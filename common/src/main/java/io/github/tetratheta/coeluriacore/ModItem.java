package io.github.tetratheta.coeluriacore;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

@SuppressWarnings("UnstableApiUsage")
public class ModItem {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CoeluriaCore.MOD_ID, Registries.ITEM);

  public static RegistrySupplier<Item> NETHERITE_SCRAP_SHARD;

  static {
    // Netherite Scrap Shard
    ResourceLocation idNetheriteScrapShard = ResourceLocation.fromNamespaceAndPath("coeluriacore", "netherite_scrap_shard");
    ResourceKey<Item> keyNetheriteScrapShard = ResourceKey.create(Registries.ITEM, idNetheriteScrapShard);

    // Register things
    NETHERITE_SCRAP_SHARD = ITEMS.register(idNetheriteScrapShard, () -> new Item(new Item.Properties().setId(keyNetheriteScrapShard).arch$tab(ModCreativeTab.COELURIACORE_TAB)));
  }
}
