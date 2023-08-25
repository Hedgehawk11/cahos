
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cahos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.cahos.item.OhSwordItem;
import net.mcreator.cahos.item.OhShovelItem;
import net.mcreator.cahos.item.OhPickaxeItem;
import net.mcreator.cahos.item.OhHoeItem;
import net.mcreator.cahos.item.OhHOItem;
import net.mcreator.cahos.item.OhAxeItem;
import net.mcreator.cahos.item.OhArmorItem;
import net.mcreator.cahos.CahosMod;

public class CahosModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CahosMod.MODID);
	public static final RegistryObject<Item> OH_HO_BLOCK = block(CahosModBlocks.OH_HO_BLOCK, null);
	public static final RegistryObject<Item> OH_HO_ORE = block(CahosModBlocks.OH_HO_ORE, null);
	public static final RegistryObject<Item> OH_AXE = REGISTRY.register("oh_axe", () -> new OhAxeItem());
	public static final RegistryObject<Item> OH_PICKAXE = REGISTRY.register("oh_pickaxe", () -> new OhPickaxeItem());
	public static final RegistryObject<Item> OH_SWORD = REGISTRY.register("oh_sword", () -> new OhSwordItem());
	public static final RegistryObject<Item> OH_SHOVEL = REGISTRY.register("oh_shovel", () -> new OhShovelItem());
	public static final RegistryObject<Item> OH_HOE = REGISTRY.register("oh_hoe", () -> new OhHoeItem());
	public static final RegistryObject<Item> OH_HO = REGISTRY.register("oh_ho", () -> new OhHOItem());
	public static final RegistryObject<Item> OH_ARMOR_HELMET = REGISTRY.register("oh_armor_helmet", () -> new OhArmorItem.Helmet());
	public static final RegistryObject<Item> OH_ARMOR_CHESTPLATE = REGISTRY.register("oh_armor_chestplate", () -> new OhArmorItem.Chestplate());
	public static final RegistryObject<Item> OH_ARMOR_LEGGINGS = REGISTRY.register("oh_armor_leggings", () -> new OhArmorItem.Leggings());
	public static final RegistryObject<Item> OH_ARMOR_BOOTS = REGISTRY.register("oh_armor_boots", () -> new OhArmorItem.Boots());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
