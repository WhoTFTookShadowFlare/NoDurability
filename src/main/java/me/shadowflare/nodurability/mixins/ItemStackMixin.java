package me.shadowflare.nodurability.mixins;

import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ItemStack.class)
public class ItemStackMixin {
	@Inject(method = "setDamage", at = @At("HEAD"), cancellable = true)
	public void setDamage(int damage, CallbackInfo cbi) {
		cbi.cancel();
	}
}
