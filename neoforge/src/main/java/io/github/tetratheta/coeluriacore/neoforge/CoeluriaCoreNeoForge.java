package io.github.tetratheta.coeluriacore.neoforge;

import io.github.tetratheta.coeluriacore.CoeluriaCore;
import net.neoforged.fml.common.Mod;

@Mod(CoeluriaCore.MOD_ID)
public final class CoeluriaCoreNeoForge {
  public CoeluriaCoreNeoForge() {
    // Run our common setup.
    CoeluriaCore.init();
  }
}
