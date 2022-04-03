package com.kibbimod.client.renderer;

import com.kibbimod.entities.EarthKibbiEntity;
import com.kibbimod.KibbiMod;
import com.kibbimod.client.renderer.models.EarthKibbiEntityModel;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class EarthKibbiRenderer<Type extends EarthKibbiEntity> extends MobRenderer<Type, EarthKibbiEntityModel<Type>> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(KibbiMod.MODID, 
			"textures/entities/earth_kibbi.png");
	public EarthKibbiRenderer(Context context) {
		super(context, new EarthKibbiEntityModel<>(context.bakeLayer(EarthKibbiEntityModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {
		return TEXTURE;
	}

}
