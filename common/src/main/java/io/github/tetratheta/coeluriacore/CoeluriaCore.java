package io.github.tetratheta.coeluriacore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class CoeluriaCore {
  public static final Logger LOGGER = LogManager.getFormatterLogger("CoeluriaCore");
  public static final String MOD_ID = "coeluriacore";

  public static void init() {
    // Write common init code here.
    LOGGER.info("Hello, world!");

    ModItem.ITEMS.register();
    ModCreativeTab.TABS.register();
  }
}
