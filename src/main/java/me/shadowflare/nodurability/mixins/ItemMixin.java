package me.shadowflare.nodurability.mixins;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Item.class)
public class ItemMixin {

	@Inject(method = "isDamageable", at = @At("HEAD"), cancellable = true)
	public void isDamageable(CallbackInfoReturnable<Boolean> cbi) {
		cbi.setReturnValue(false);
		cbi.cancel();
	}
}
