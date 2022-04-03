package com.kibbimod;
import com.kibbimod.entities.*;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
public class EntityInit {
	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, 
			KibbiMod.MODID);
	private EntityInit() {
	}
	public static final RegistryObject<EntityType<FireKibbiEntity>> FIRE_KIBBI = ENTITIES.register("fire_kibbi",
				()->EntityType.Builder.of(FireKibbiEntity::new, MobCategory.CREATURE).sized(1, 1)
				.build(new ResourceLocation(KibbiMod.MODID, "fire_kibbi").toString()));
	public static final RegistryObject<EntityType<IceKibbiEntity>> ICE_KIBBI = ENTITIES.register("ice_kibbi",
			()->EntityType.Builder.of(IceKibbiEntity::new, MobCategory.CREATURE).sized(1, 1)
			.build(new ResourceLocation(KibbiMod.MODID, "ice_kibbi").toString()));
	public static final RegistryObject<EntityType<EarthKibbiEntity>> EARTH_KIBBI = ENTITIES.register("earth_kibbi",
			()->EntityType.Builder.of(EarthKibbiEntity::new, MobCategory.CREATURE).sized(1, 1)
			.build(new ResourceLocation(KibbiMod.MODID, "earth_kibbi").toString()));
}
