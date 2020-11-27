package net.mcreator.analcraft.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.analcraft.ElementsAnalCraft;

@ElementsAnalCraft.ModElement.Tag
public class ProcedureTrusiLeggingsTickEvent extends ElementsAnalCraft.ModElement {
	public ProcedureTrusiLeggingsTickEvent(ElementsAnalCraft instance) {
		super(instance, 36);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TrusiLeggingsTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST, (int) 60, (int) 1));
	}
}
