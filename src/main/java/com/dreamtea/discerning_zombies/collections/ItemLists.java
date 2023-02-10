package com.dreamtea.discerning_zombies.collections;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import java.util.List;

public class ItemLists {

    private static Item[] listToArray(List<Item> items){
        return items.toArray(Item[]::new);
    }
    public static Item[] bannedPlants(){
        return listToArray(List.of(
                Items.WHEAT_SEEDS,
                Items.WHEAT,
                Items.CARROT,
                Items.POTATO,
                Items.POISONOUS_POTATO,
                Items.BEETROOT,
                Items.KELP,
                Items.GLOW_BERRIES,
                Items.BROWN_MUSHROOM,
                Items.RED_MUSHROOM,
                Items.BEETROOT_SEEDS
        ));
    }
    public static  Item[] bannedBlocks(){
        return listToArray(List.of(
                Items.DIRT,
                Items.SAND,
                Items.COBBLESTONE,
                Items.GRAVEL,
                Items.GRASS_BLOCK,
                Items.COBBLED_DEEPSLATE
        ));
    }
    public static  Item[] bannedDrops(){
        return listToArray(List.of(
                //Glow Squid
                Items.GLOW_INK_SAC,
                Items.INK_SAC,
                //Passives meat
                Items.BEEF,
                Items.COOKED_BEEF,
                Items.PORKCHOP,
                Items.COOKED_PORKCHOP,
                Items.MUTTON,
                Items.COOKED_MUTTON,
                Items.RABBIT,
                Items.COOKED_RABBIT,
                Items.RABBIT_HIDE,
                //Stray or Skel drops
                Items.ARROW,
                Items.TIPPED_ARROW,
                Items.BONE,
                //Fish death
                Items.TROPICAL_FISH,
                Items.COD,
                Items.SALMON,
                Items.PUFFERFISH,
                Items.BONE_MEAL,
                Items.SEAGRASS,
                //Chicken
                Items.CHICKEN,
                Items.COOKED_CHICKEN,
                Items.EGG,
                Items.FEATHER,
                //Creeper
                Items.GUNPOWDER,
                //Spider and cobwebs
                Items.STRING,
                //Zombie
                Items.ROTTEN_FLESH,
                //Enderman
                Items.ENDER_PEARL,
                //Iron Golem
                Items.POPPY,
                Items.IRON_INGOT,
                //Zombified Piglin
                Items.GOLD_NUGGET,
                //Panda
                Items.BAMBOO,
                //Slime
                Items.SLIME_BALL,
                //Witch
                Items.GLASS_BOTTLE,
                Items.STICK,
                Items.GLOWSTONE_DUST,
                Items.SPIDER_EYE,
                Items.SUGAR,
                //Drowned
                Items.COPPER_INGOT,
                //Guardians
                Items.PRISMARINE_CRYSTALS,
                Items.PRISMARINE_SHARD
            ));
    }
}
