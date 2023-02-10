package com.dreamtea.discerning_zombies.datagen;

import com.dreamtea.discerning_zombies.collections.ItemLists;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.dreamtea.discerning_zombies.DiscerningZombies.NAMESPACE;

public class Tags extends FabricTagProvider.ItemTagProvider {

  public static Identifier ZOMBIE_NO_PICKUP = new Identifier(NAMESPACE, "zombie_cannot_pickup");
  public static TagKey<Item> ZOMBIE_NO_PICKUP_TAG = createItemTag(ZOMBIE_NO_PICKUP);
  public static Identifier ZOMBIE_NO_PICKUP_MOB_LOOT = new Identifier(NAMESPACE, "zombie_cannot_pickup_loot");
  public static TagKey<Item> ZOMBIE_NO_PICKUP_MOB_LOOT_TAG = createItemTag(ZOMBIE_NO_PICKUP_MOB_LOOT);
  public static Identifier ZOMBIE_NO_PICKUP_PLANT = new Identifier(NAMESPACE, "zombie_cannot_pickup_plant");
  public static TagKey<Item> ZOMBIE_NO_PICKUP_PLANT_TAG = createItemTag(ZOMBIE_NO_PICKUP_PLANT);
  public static Identifier ZOMBIE_NO_PICKUP_BLOCKS = new Identifier(NAMESPACE, "zombie_cannot_pickup_blocks");
  public static TagKey<Item> ZOMBIE_NO_PICKUP_BLOCKS_TAG = createItemTag(ZOMBIE_NO_PICKUP_BLOCKS);
  public static TagKey<Item> createItemTag(Identifier tag){
    return TagKey.of(Registry.ITEM_KEY,tag);
  }
  public static boolean itemIsIn(ItemStack item, TagKey<Item> key){
    return itemIsIn(item.getItem(), key);
  }
  public static boolean itemIsIn(Item item, TagKey<Item> key){
    return Registry.ITEM.getOrCreateEntry(Registry.ITEM.getKey(item).get()).isIn(key);
  }
  public Tags(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    getOrCreateTagBuilder(ZOMBIE_NO_PICKUP_BLOCKS_TAG).add(ItemLists.bannedBlocks());
    getOrCreateTagBuilder(ZOMBIE_NO_PICKUP_PLANT_TAG).add(ItemLists.bannedPlants());
    getOrCreateTagBuilder(ZOMBIE_NO_PICKUP_MOB_LOOT_TAG).add(ItemLists.bannedDrops());
    getOrCreateTagBuilder(ZOMBIE_NO_PICKUP_TAG)
            .addTag(ZOMBIE_NO_PICKUP_MOB_LOOT_TAG)
            .addTag(ZOMBIE_NO_PICKUP_PLANT_TAG)
            .addTag(ZOMBIE_NO_PICKUP_BLOCKS_TAG);
  }
}
