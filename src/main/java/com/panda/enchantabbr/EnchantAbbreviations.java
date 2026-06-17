package com.panda.enchantabbr;

import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class EnchantAbbreviations {
    private static final Map<String, String> NORMAL = new HashMap<>();
    private static final Map<String, String> ULTIMATE = new HashMap<>();

    static {
        NORMAL.put("absorb", "AB");
        NORMAL.put("angler", "AN");
        NORMAL.put("aqua_affinity", "AA");
        NORMAL.put("arcane", "WS");
        NORMAL.put("aiming", "DT");
        NORMAL.put("bane_of_arthropods", "BOA");
        NORMAL.put("big_brain", "BB");
        NORMAL.put("blast_protection", "BP");
        NORMAL.put("blessing", "BL");
        NORMAL.put("bug_blender", "BUG");
        NORMAL.put("caster", "CAT");
        NORMAL.put("cayenne", "CAY");
        NORMAL.put("champion", "CHM");
        NORMAL.put("chance", "CHN");
        NORMAL.put("charm", "CHR");
        NORMAL.put("cleave", "CL");
        NORMAL.put("compact", "COM");
        NORMAL.put("corruption", "COR");
        NORMAL.put("counter_strike", "CS");
        NORMAL.put("critical", "CR");
        NORMAL.put("cubism", "CUB");
        NORMAL.put("cultivating", "CUL");
        NORMAL.put("dedication", "DED");
        NORMAL.put("delicate", "DEL");
        NORMAL.put("depth_strider", "DS");
        NORMAL.put("divine_gift", "DG");
        NORMAL.put("dragon_hunter", "GV");
        NORMAL.put("efficiency", "EF");
        NORMAL.put("ender_slayer", "ES");
        NORMAL.put("execute", "EXE");
        NORMAL.put("experience", "EXP");
        NORMAL.put("expertise", "EPR");
        NORMAL.put("feast", "FE");
        NORMAL.put("feather_falling", "FF");
        NORMAL.put("ferocious_mana", "FM");
        NORMAL.put("fire_aspect", "FA");
        NORMAL.put("fire_protection", "FPR");
        NORMAL.put("first_strike", "FS");
        NORMAL.put("flame", "FL");
        NORMAL.put("forest_pledge", "FPL");
        NORMAL.put("fortune", "FO");
        NORMAL.put("frail", "FR");
        NORMAL.put("giant_killer", "GK");
        NORMAL.put("great_spook", "GS");
        NORMAL.put("green_thumb", "GT");
        NORMAL.put("growth", "GR");
        NORMAL.put("hardened_mana", "HM");
        NORMAL.put("harvesting", "HRV");
        NORMAL.put("hecatomb", "HEC");
        NORMAL.put("ice_cold", "IC");
        NORMAL.put("impaling", "IMP");
        NORMAL.put("infinite_quiver", "IQ");
        NORMAL.put("knockback", "KB");
        NORMAL.put("lapidary", "LAP");
        NORMAL.put("lethality", "LE");
        NORMAL.put("life_steal", "LS");
        NORMAL.put("looting", "LO");
        NORMAL.put("luck", "LU");
        NORMAL.put("luck_of_the_sea", "LTS");
        NORMAL.put("lure", "LR");
        NORMAL.put("magnet", "MAG");
        NORMAL.put("mana_steal", "MS");
        NORMAL.put("mana_vampire", "MV");
        NORMAL.put("overload", "OV");
        NORMAL.put("paleontologist", "PAL");
        NORMAL.put("pesterminator", "PS");
        NORMAL.put("piercing", "PR");
        NORMAL.put("piscary", "PSC");
        NORMAL.put("power", "POW");
        NORMAL.put("pristine", "PRI");
        NORMAL.put("projectile_protection", "PP");
        NORMAL.put("prosecute", "PRS");
        NORMAL.put("prosperity", "PSP");
        NORMAL.put("protection", "PRO");
        NORMAL.put("punch", "PU");
        NORMAL.put("quantum", "QUA");
        NORMAL.put("quick_bite", "QB");
        NORMAL.put("rainbow", "RA");
        NORMAL.put("reflection", "REF");
        NORMAL.put("rejuvenate", "RJ");
        NORMAL.put("replenish", "REP");
        NORMAL.put("respiration", "RES");
        NORMAL.put("respite", "RSP");
        NORMAL.put("scavenger", "SCV");
        NORMAL.put("scuba", "SCU");
        NORMAL.put("sharpness", "SH");
        NORMAL.put("silk_touch", "ST");
        NORMAL.put("small_brain", "SB");
        NORMAL.put("smarty_pants", "SP");
        NORMAL.put("smelting_touch", "SMT");
        NORMAL.put("smite", "SMI");
        NORMAL.put("smoldering", "SML");
        NORMAL.put("snipe", "SN");
        NORMAL.put("spiked_hook", "SPH");
        NORMAL.put("stealth", "STL");
        NORMAL.put("strong_mana", "SM");
        NORMAL.put("sugar_rush", "SR");
        NORMAL.put("syphon", "DR");
        NORMAL.put("tabasco", "TAB");
        NORMAL.put("thorns", "TH");
        NORMAL.put("thunderbolt", "TB");
        NORMAL.put("thunderlord", "TL");
        NORMAL.put("tidal", "TD");
        NORMAL.put("titan_killer", "TK");
        NORMAL.put("toxophilite", "TX");
        NORMAL.put("transylvanian", "TRN");
        NORMAL.put("triple_strike", "TS");
        NORMAL.put("true_protection", "TP");
        NORMAL.put("turbo_cactus", "TCC");
        NORMAL.put("turbo_cane", "TCN");
        NORMAL.put("turbo_carrot", "TCR");
        NORMAL.put("turbo_coco", "TCO");
        NORMAL.put("turbo_melon", "TME");
        NORMAL.put("turbo_moonflower", "TMO");
        NORMAL.put("turbo_mushrooms", "TMU");
        NORMAL.put("turbo_potato", "TPO");
        NORMAL.put("turbo_pumpkin", "TPU");
        NORMAL.put("turbo_rose", "TRO");
        NORMAL.put("turbo_sunflower", "TSU");
        NORMAL.put("turbo_warts", "TWA");
        NORMAL.put("turbo_wheat", "TWH");
        NORMAL.put("vampirism", "VMP");
        NORMAL.put("venomous", "VEN");
        NORMAL.put("vicious", "VIC");
        ULTIMATE.put("ultimate_bank", "B");
        ULTIMATE.put("ultimate_bobbin_time", "BT");
        ULTIMATE.put("ultimate_chimera", "CH");
        ULTIMATE.put("ultimate_combo", "CO");
        ULTIMATE.put("ultimate_crop_fever", "CF");
        ULTIMATE.put("ultimate_reiterate", "DU");
        ULTIMATE.put("ultimate_fatal_tempo", "FT");
        ULTIMATE.put("ultimate_first_impression", "FI");
        ULTIMATE.put("ultimate_flash", "FL");
        ULTIMATE.put("ultimate_flowstate", "FLW");
        ULTIMATE.put("ultimate_habanero_tactics", "HT");
        ULTIMATE.put("ultimate_inferno", "IN");
        ULTIMATE.put("ultimate_last_stand", "LS");
        ULTIMATE.put("ultimate_legion", "L");
        ULTIMATE.put("ultimate_missile", "M");
        ULTIMATE.put("ultimate_no_pain_no_gain", "NP");
        ULTIMATE.put("ultimate_one_for_all", "OFA");
        ULTIMATE.put("ultimate_refrigerate", "RF");
        ULTIMATE.put("ultimate_rend", "RN");
        ULTIMATE.put("ultimate_soul_eater", "SE");
        ULTIMATE.put("ultimate_sunset", "SU");
        ULTIMATE.put("ultimate_swarm", "SW");
        ULTIMATE.put("ultimate_the_one", "TO");
        ULTIMATE.put("ultimate_jerry", "UJ");
        ULTIMATE.put("ultimate_wise", "UW");
        ULTIMATE.put("ultimate_wisdom", "W");
    }

    private EnchantAbbreviations() {}

    public static Component getText(ItemStack stack) {
        if (stack == null || stack.isEmpty() || !stack.is(Items.ENCHANTED_BOOK)) return null;
        String displayName = ChatFormatting.stripFormatting(stack.getHoverName().getString());
        if (displayName == null || !displayName.equals("Enchanted Book")) return null;

        String enchantmentId = getSingleSkyBlockEnchantmentId(stack);
        if (enchantmentId == null || enchantmentId.isBlank()) return null;

        String key = enchantmentId.toLowerCase(Locale.ROOT);
        String normal = NORMAL.get(key);
        if (normal != null) return Component.literal(normal).withStyle(ChatFormatting.BLUE);

        String ultimate = ULTIMATE.get(key);
        if (ultimate != null) return Component.literal(ultimate).withStyle(ChatFormatting.LIGHT_PURPLE);

        return null;
    }

    @SuppressWarnings("unchecked")
    private static String getSingleSkyBlockEnchantmentId(ItemStack stack) {
        try {
            Object customData = stack.get(DataComponents.CUSTOM_DATA);
            if (customData == null) return null;

            Method copyTag = customData.getClass().getMethod("copyTag");
            Object tag = copyTag.invoke(customData);
            if (tag == null) return null;

            Method contains = tag.getClass().getMethod("contains", String.class);
            boolean hasEnchantments = (Boolean) contains.invoke(tag, "enchantments");
            if (!hasEnchantments) return null;

            Object enchantments;
            try {
                enchantments = tag.getClass().getMethod("getCompoundOrEmpty", String.class).invoke(tag, "enchantments");
            } catch (NoSuchMethodException ignored) {
                enchantments = tag.getClass().getMethod("getCompound", String.class).invoke(tag, "enchantments");
            }
            if (enchantments == null) return null;

            int size = ((Number) enchantments.getClass().getMethod("size").invoke(enchantments)).intValue();
            if (size != 1) return null;

            Set<String> keys = (Set<String>) enchantments.getClass().getMethod("keySet").invoke(enchantments);
            if (keys == null || keys.size() != 1) return null;
            return keys.iterator().next();
        } catch (Throwable t) {
            EnchantAbbrClient.LOGGER.debug("Failed to read SkyBlock enchantment data", t);
            return null;
        }
    }
}
