
package net.mcreator.analcraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.analcraft.item.ItemYuutltghie;
import net.mcreator.analcraft.item.ItemSpermesword;
import net.mcreator.analcraft.ElementsAnalCraft;

@ElementsAnalCraft.ModElement.Tag
public class RecipeSpermesw extends ElementsAnalCraft.ModElement {
	public RecipeSpermesw(ElementsAnalCraft instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemYuutltghie.block, (int) (1)), new ItemStack(ItemSpermesword.block, (int) (1)), 1F);
	}
}
