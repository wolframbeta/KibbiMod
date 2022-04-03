package com.kibbimod.event;

import com.kibbimod.EntityInit;
import com.kibbimod.KibbiMod;
import com.kibbimod.entities.*;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
@Mod.EventBusSubscriber(modid = KibbiMod.MODID, bus = Bus.MOD)
public class CommonModEvents {
	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(EntityInit.FIRE_KIBBI.get(), FireKibbiEntity.createAttributes().build());
		event.put(EntityInit.ICE_KIBBI.get(), IceKibbiEntity.createAttributes().build());
		event.put(EntityInit.EARTH_KIBBI.get(), EarthKibbiEntity.createAttributes().build());
	}
}
