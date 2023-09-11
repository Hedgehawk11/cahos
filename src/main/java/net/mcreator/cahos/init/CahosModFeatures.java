
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cahos.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.cahos.world.features.ores.OhHOOreFeature;
import net.mcreator.cahos.CahosMod;

@Mod.EventBusSubscriber
public class CahosModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, CahosMod.MODID);
	public static final RegistryObject<Feature<?>> OH_HO_ORE = REGISTRY.register("oh_ho_ore", OhHOOreFeature::new);
}
