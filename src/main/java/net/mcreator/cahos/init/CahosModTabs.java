
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.cahos.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.CreativeModeTabs;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CahosModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(CahosModItems.OH_SWORD.get());
			tabData.accept(CahosModItems.OH_ARMOR_HELMET.get());
			tabData.accept(CahosModItems.OH_ARMOR_CHESTPLATE.get());
			tabData.accept(CahosModItems.OH_ARMOR_LEGGINGS.get());
			tabData.accept(CahosModItems.OH_ARMOR_BOOTS.get());
			tabData.accept(CahosModItems.BUTTION.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(CahosModItems.OH_AXE.get());
			tabData.accept(CahosModItems.OH_PICKAXE.get());
			tabData.accept(CahosModItems.OH_SHOVEL.get());
			tabData.accept(CahosModItems.OH_HOE.get());
		}
	}
}
