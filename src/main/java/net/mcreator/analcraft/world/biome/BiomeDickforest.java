
package net.mcreator.analcraft.world.biome;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.BiomeManager;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;
import net.minecraft.init.Blocks;

import net.mcreator.analcraft.entity.EntityVan;
import net.mcreator.analcraft.entity.EntitySemenlime;
import net.mcreator.analcraft.block.BlockSpermegrass;
import net.mcreator.analcraft.ElementsAnalCraft;

import java.util.Random;

@ElementsAnalCraft.ModElement.Tag
public class BiomeDickforest extends ElementsAnalCraft.ModElement {
	@GameRegistry.ObjectHolder("analcraft:dickforest")
	public static final BiomeGenCustom biome = null;
	public BiomeDickforest(ElementsAnalCraft instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biome, 1000));
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Dick Forest").setRainfall(0.5F).setBaseHeight(0.1F).setWaterColor(-1).setHeightVariation(0.07F)
					.setTemperature(0.35F));
			setRegistryName("dickforest");
			topBlock = BlockSpermegrass.block.getDefaultState();
			fillerBlock = Blocks.STONE.getStateFromMeta(0);
			decorator.generateFalls = true;
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
			this.spawnableCreatureList.add(new SpawnListEntry(EntityVan.EntityCustom.class, 40, 1, 5));
			this.spawnableCreatureList.add(new SpawnListEntry(EntitySemenlime.EntityCustom.class, 40, 1, 5));
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -1;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -1;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -6710785;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
