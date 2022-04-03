package com.kibbimod.client.renderer.models;

import com.kibbimod.KibbiMod;
import com.kibbimod.entities.EarthKibbiEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class EarthKibbiEntityModel<Type extends EarthKibbiEntity> extends EntityModel<Type> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(KibbiMod.MODID, "earth_kibbi"), "main");
	private final ModelPart rightLeg;
	private final ModelPart leftLeg;

	private final ModelPart Body;
	private final ModelPart Tail;
	private final ModelPart Head;
	private final ModelPart Arms;

	public EarthKibbiEntityModel(ModelPart root) {
		this.leftLeg = root.getChild("leftLeg");
		this.rightLeg = root.getChild("rightLeg");
		this.Body = root.getChild("Body");
		this.Tail = root.getChild("Tail");
		this.Head = root.getChild("Head");
		this.Arms = root.getChild("Arms");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition leftLeg = partdefinition.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 22.5F, 0.0F));

		PartDefinition leftLeg_r1 = leftLeg.addOrReplaceChild("leftLeg_r1", CubeListBuilder.create().texOffs(18, 44).addBox(-2.0F, -3.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 3.1416F));

		PartDefinition rightLeg = partdefinition.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightLeg_r1 = rightLeg.addOrReplaceChild("rightLeg_r1", CubeListBuilder.create().texOffs(44, 43).addBox(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -1.5F, 0.0F, 3.1416F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Body_r1 = Body.addOrReplaceChild("Body_r1", CubeListBuilder.create().texOffs(37, 0).addBox(-3.5F, 5.0F, -1.5F, 7.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -14.0F, 0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Tail = partdefinition.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -1.0F));

		PartDefinition Tail_r1 = Tail.addOrReplaceChild("Tail_r1", CubeListBuilder.create().texOffs(0, 48).addBox(-0.5F, 10.0F, -2.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -14.0F, 1.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(-0.5F, 10.5833F, 0.9583F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 39).addBox(6.5F, -3.0F, -3.5F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(5, 50).addBox(-7.5F, -3.0F, -3.5F, 1.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 29).addBox(-4.5F, -7.0F, -3.5F, 9.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(31, 19).addBox(-4.5F, -4.0F, -5.5F, 9.0F, 6.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(31, 37).addBox(-2.5F, 4.0F, -0.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-6.5F, -5.0F, -4.5F, 13.0F, 8.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-5.5F, -6.0F, -3.5F, 11.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(29, 41).addBox(-2.5F, 3.0F, -3.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 41).addBox(-2.5F, 3.0F, 4.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 29).addBox(-3.5F, 3.0F, -2.5F, 7.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5833F, -0.4583F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(31, 26).addBox(-1.5F, 3.0F, 3.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 41).addBox(-1.5F, 3.0F, -4.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.5833F, -0.4583F, 3.1416F, 3.1416F, -3.1416F));

		PartDefinition Ears = Head.addOrReplaceChild("Ears", CubeListBuilder.create(), PartPose.offset(0.5F, 9.4167F, -0.9583F));

		PartDefinition RightEar = Ears.addOrReplaceChild("RightEar", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3 = RightEar.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 44).addBox(5.5F, -10.0F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(6, 7).addBox(2.5F, -12.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(47, 30).addBox(1.5F, -11.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(21, 38).addBox(1.5F, -10.0F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(24, 47).addBox(4.5F, -7.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(47, 33).addBox(4.5F, -13.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 38).addBox(2.5F, -12.0F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(47, 26).addBox(2.5F, -10.0F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 43).addBox(2.5F, -11.0F, -1.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(36, 43).addBox(2.5F, -11.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -10.0F, 0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition LeftEar = Ears.addOrReplaceChild("LeftEar", CubeListBuilder.create(), PartPose.offset(-10.0F, 0.0F, 0.0F));

		PartDefinition cube_r4 = LeftEar.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(6, 0).addBox(-3.5F, -12.0F, 0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(41, 26).addBox(-2.5F, -11.0F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 29).addBox(-2.5F, -10.0F, -0.5F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(44, 37).addBox(-5.5F, -7.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(12, 47).addBox(-5.5F, -13.0F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 38).addBox(-6.5F, -12.0F, -1.5F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(28, 43).addBox(-5.5F, -11.0F, -0.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 7).addBox(-4.5F, -10.0F, -2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 41).addBox(-5.5F, -11.0F, -1.5F, 3.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(26, 29).addBox(-6.5F, -10.0F, -1.5F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.5F, -10.0F, 0.5F, 0.0F, 3.1416F, 0.0F));

		PartDefinition Arms = partdefinition.addOrReplaceChild("Arms", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 0.0F));

		PartDefinition RArm_r1 = Arms.addOrReplaceChild("RArm_r1", CubeListBuilder.create().texOffs(0, 0).addBox(3.5F, 5.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 19).addBox(-5.5F, 5.0F, -0.5F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -10.0F, 0.5F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(EarthKibbiEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	      this.rightLeg.xRot = Mth.cos(limbSwing * 0.6662F) * 1.0F * limbSwingAmount;
	      this.leftLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.0F * limbSwingAmount;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		leftLeg.render(poseStack, buffer, packedLight, packedOverlay);
		rightLeg.render(poseStack, buffer, packedLight, packedOverlay);
		Body.render(poseStack, buffer, packedLight, packedOverlay);
		Tail.render(poseStack, buffer, packedLight, packedOverlay);
		Head.render(poseStack, buffer, packedLight, packedOverlay);
		Arms.render(poseStack, buffer, packedLight, packedOverlay);
	}
}