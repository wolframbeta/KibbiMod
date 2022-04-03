package com.kibbimod.client.renderer;

import com.kibbimod.entities.IceKibbiEntity;
import com.kibbimod.KibbiMod;
import com.kibbimod.client.renderer.models.IceKibbiEntityModel;

import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class IceKibbiRenderer<Type extends IceKibbiEntity> extends MobRenderer<Type, IceKibbiEntityModel<Type>> {
	private static final ResourceLocation TEXTURE = new ResourceLocation(KibbiMod.MODID, 
			"textures/entities/ice_kibbi.png");
	public IceKibbiRenderer(Context context) {
		super(context, new IceKibbiEntityModel<>(context.bakeLayer(IceKibbiEntityModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(Type entity) {
		return TEXTURE;
	}

}
