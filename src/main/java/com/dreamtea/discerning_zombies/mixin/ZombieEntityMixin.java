package com.dreamtea.discerning_zombies.mixin;

import net.minecraft.entity.mob.ZombieEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import static com.dreamtea.discerning_zombies.datagen.Tags.ZOMBIE_NO_PICKUP_TAG;
import static com.dreamtea.discerning_zombies.datagen.Tags.itemIsIn;

@Mixin(ZombieEntity.class)
public class ZombieEntityMixin {

    @Redirect(method = "canPickupItem",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"
        )
    )
    public boolean zombiesDiscernPickup(ItemStack instance, Item item){
        return itemIsIn(instance, ZOMBIE_NO_PICKUP_TAG) && !instance.hasCustomName();
    }

    @Redirect(method = "canGather",
        at = @At(
            value = "INVOKE",
            target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"
        )
    )
    public boolean zombiesDiscernGather(ItemStack instance, Item item){
        return itemIsIn(instance, ZOMBIE_NO_PICKUP_TAG) && !instance.hasCustomName();
    }
}
