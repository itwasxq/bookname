package com.panda.enchantabbr.mixin;

import com.panda.enchantabbr.EnchantAbbreviations;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.util.CommonColors;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import org.joml.Matrix3x2fStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractContainerScreen.class)
public abstract class AbstractContainerScreenMixin<T extends AbstractContainerMenu> extends Screen {
    protected AbstractContainerScreenMixin(Component title) {
        super(title);
    }

    @Inject(
            method = "extractSlot",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/GuiGraphicsExtractor;itemDecorations(Lnet/minecraft/client/gui/Font;Lnet/minecraft/world/item/ItemStack;IILjava/lang/String;)V",
                    shift = At.Shift.AFTER
            )
    )
    private void enchantabbr26$drawAbbreviation(GuiGraphicsExtractor graphics, Slot slot, CallbackInfo ci) {
        Component text = EnchantAbbreviations.getText(slot.getItem());
        if (text == null) return;
        drawTopRight(graphics, this.font, text, slot.x, slot.y);
    }

    private static void drawTopRight(GuiGraphicsExtractor graphics, Font font, Component text, int x, int y) {
        Matrix3x2fStack matrices = graphics.pose();
        matrices.pushMatrix();
        int width = font.width(text);
        int drawX = x + 16 - width;
        int drawY = y;

        if (width > 16) {
            float scale = 16.0F / width;
            matrices.scale(scale, scale);
            drawX = Math.round((x + 16) / scale - width);
            drawY = Math.round(y / scale);
        }

        graphics.text(font, text, drawX, drawY, CommonColors.WHITE, true);
        matrices.popMatrix();
    }
}
