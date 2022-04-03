package com.kibbimod.client.renderer;

import com.kibbimod.entities.FireKibbiEntity;
import com.kibbimod.KibbiMod;
import com.kibbimod.client.renderer.models.FireKibbiEntityModel;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class FireKibbiRenderer<Type extends FireKibbiEntity> extends MobRenderer<Type, FireKibbiEntityModel<Type>> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(KibbiMod.MODID, 
			"textures/entities/fire_kibbi.png");
	public FireKibbiRenderer(Context context) {
		super(context, new FireKibbiEntityModel<>(context.bakeLayer(FireKibbiEntityModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {
		return TEXTURE;
	}

}
