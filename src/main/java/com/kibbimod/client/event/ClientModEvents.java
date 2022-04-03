package com.kibbimod.client.event;

import com.kibbimod.EntityInit;
import com.kibbimod.KibbiMod;
import com.kibbimod.client.renderer.*;
import com.kibbimod.client.renderer.models.*;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = KibbiMod.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
	private ClientModEvents() {
		
	}
	@SubscribeEvent
	public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(FireKibbiEntityModel.LAYER_LOCATION, FireKibbiEntityModel::createBodyLayer);
		event.registerLayerDefinition(EarthKibbiEntityModel.LAYER_LOCATION, EarthKibbiEntityModel::createBodyLayer);;
		event.registerLayerDefinition(IceKibbiEntityModel.LAYER_LOCATION, IceKibbiEntityModel::createBodyLayer);;

	}
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(EntityInit.FIRE_KIBBI.get(), FireKibbiRenderer::new);
		event.registerEntityRenderer(EntityInit.EARTH_KIBBI.get(), EarthKibbiRenderer::new);
		event.registerEntityRenderer(EntityInit.ICE_KIBBI.get(), IceKibbiRenderer::new);


	}
}
