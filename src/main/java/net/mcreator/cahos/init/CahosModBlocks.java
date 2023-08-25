
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cahos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.cahos.block.OhHOOreBlock;
import net.mcreator.cahos.block.OhHOBlockBlock;
import net.mcreator.cahos.CahosMod;

public class CahosModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CahosMod.MODID);
	public static final RegistryObject<Block> OH_HO_BLOCK = REGISTRY.register("oh_ho_block", () -> new OhHOBlockBlock());
	public static final RegistryObject<Block> OH_HO_ORE = REGISTRY.register("oh_ho_ore", () -> new OhHOOreBlock());
}
