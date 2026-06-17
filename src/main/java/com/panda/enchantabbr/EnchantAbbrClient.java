package com.panda.enchantabbr;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class EnchantAbbrClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("EnchantAbbr26");

    @Override
    public void onInitializeClient() {
        LOGGER.info("Enchant Abbreviation 26 loaded successfully!");
    }
}
