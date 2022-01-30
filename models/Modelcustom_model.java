// Made with Blockbench 4.0.5
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer headwear;
	private final ModelRenderer hat2;
	private final ModelRenderer hat3;
	private final ModelRenderer hat4;
	private final ModelRenderer headwear2;
	private final ModelRenderer nose;
	private final ModelRenderer mole;
	private final ModelRenderer body;
	private final ModelRenderer bodywear;
	private final ModelRenderer arms;
	private final ModelRenderer arms_rotation;
	private final ModelRenderer arms_flipped;
	private final ModelRenderer left_leg;
	private final ModelRenderer right_leg;

	public Modelcustom_model() {
		texWidth = 64;
		texHeight = 128;

		head = new ModelRenderer(this);
		head.setPos(0.0F, 0.0F, 0.0F);
		head.texOffs(0, 0).addBox(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, 0.0F, false);

		headwear = new ModelRenderer(this);
		headwear.setPos(5.0F, -10.05F, -5.0F);
		headwear.texOffs(0, 64).addBox(-10.0F, 0.0F, 0.0F, 10.0F, 2.0F, 10.0F, 0.0F, false);

		hat2 = new ModelRenderer(this);
		hat2.setPos(-8.25F, -4.0F, 2.0F);
		headwear.addChild(hat2);
		setRotationAngle(hat2, -0.0524F, 0.0F, 0.0262F);
		hat2.texOffs(0, 76).addBox(0.0F, 0.0F, 0.0F, 7.0F, 4.0F, 7.0F, 0.0F, false);

		hat3 = new ModelRenderer(this);
		hat3.setPos(1.75F, -4.0F, 2.0F);
		hat2.addChild(hat3);
		setRotationAngle(hat3, -0.1047F, 0.0F, 0.0524F);
		hat3.texOffs(0, 87).addBox(0.0F, 0.0F, 0.0F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		hat4 = new ModelRenderer(this);
		hat4.setPos(1.75F, -2.0F, 2.0F);
		hat3.addChild(hat4);
		setRotationAngle(hat4, -0.2094F, 0.0F, 0.1047F);
		hat4.texOffs(0, 95).addBox(0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.25F, false);

		headwear2 = new ModelRenderer(this);
		headwear2.setPos(0.0F, 24.0F, 0.0F);

		nose = new ModelRenderer(this);
		nose.setPos(0.0F, -2.0F, 0.0F);
		nose.texOffs(24, 0).addBox(-1.0F, -1.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

		mole = new ModelRenderer(this);
		mole.setPos(0.0F, -4.0F, 0.0F);
		mole.texOffs(0, 0).addBox(0.0F, 3.0F, -6.75F, 1.0F, 1.0F, 1.0F, -0.25F, false);

		body = new ModelRenderer(this);
		body.setPos(0.0F, 0.0F, 0.0F);
		body.texOffs(16, 20).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, 0.0F, false);

		bodywear = new ModelRenderer(this);
		bodywear.setPos(0.0F, 0.0F, 0.0F);
		bodywear.texOffs(0, 38).addBox(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, 0.5F, false);

		arms = new ModelRenderer(this);
		arms.setPos(0.0F, 3.5F, 0.3F);

		arms_rotation = new ModelRenderer(this);
		arms_rotation.setPos(0.0F, -2.0F, 0.05F);
		arms.addChild(arms_rotation);
		setRotationAngle(arms_rotation, -0.7505F, 0.0F, 0.0F);
		arms_rotation.texOffs(44, 22).addBox(-8.0F, 0.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);
		arms_rotation.texOffs(40, 38).addBox(-4.0F, 4.0F, -2.0F, 8.0F, 4.0F, 4.0F, 0.0F, false);

		arms_flipped = new ModelRenderer(this);
		arms_flipped.setPos(0.0F, 24.0F, 0.0F);
		arms_rotation.addChild(arms_flipped);
		arms_flipped.texOffs(44, 22).addBox(4.0F, -24.0F, -2.0F, 4.0F, 8.0F, 4.0F, 0.0F, true);

		left_leg = new ModelRenderer(this);
		left_leg.setPos(-2.0F, 12.0F, 0.0F);
		left_leg.texOffs(0, 22).addBox(2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		right_leg = new ModelRenderer(this);
		right_leg.setPos(2.0F, 12.0F, 0.0F);
		right_leg.texOffs(0, 22).addBox(-6.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, true);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		headwear.render(matrixStack, buffer, packedLight, packedOverlay);
		headwear2.render(matrixStack, buffer, packedLight, packedOverlay);
		nose.render(matrixStack, buffer, packedLight, packedOverlay);
		mole.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		bodywear.render(matrixStack, buffer, packedLight, packedOverlay);
		arms.render(matrixStack, buffer, packedLight, packedOverlay);
		left_leg.render(matrixStack, buffer, packedLight, packedOverlay);
		right_leg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.arms_flipped.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}