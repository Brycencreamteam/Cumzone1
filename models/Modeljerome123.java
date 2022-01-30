// Made with Blockbench 4.1.3
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modeljerome123 extends EntityModel<Entity> {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RightArm;
	private final ModelRenderer LeftArm;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer Rightleg;

	public Modeljerome123() {
		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 1).addBox(-5.0F, -35.0F, -5.0F, 10.0F, 10.0F, 9.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.setTextureOffset(44, 1).addBox(-7.0F, -10.0F, -4.0F, 14.0F, 11.0F, 7.0F, 0.0F, false);
		Body.setTextureOffset(1, 35).addBox(-5.0F, -9.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(1, 34).addBox(-5.0F, -6.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(1, 35).addBox(1.0F, -6.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(1, 35).addBox(1.0F, -3.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(1, 34).addBox(-5.0F, -3.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(1, 35).addBox(1.0F, -9.0F, -5.0F, 4.0F, 2.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(5, 101).addBox(-10.0F, -22.0F, -3.0F, 2.0F, 7.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(5, 101).addBox(8.0F, -22.0F, -3.0F, 2.0F, 7.0F, 4.0F, 0.0F, false);
		Body.setTextureOffset(31, 27).addBox(-8.0F, -21.0F, -5.0F, 7.0F, 11.0F, 9.0F, 0.0F, false);
		Body.setTextureOffset(92, 102).addBox(-6.0F, -15.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(92, 102).addBox(5.0F, -15.0F, -6.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		Body.setTextureOffset(57, 36).addBox(1.0F, -21.0F, -5.0F, 7.0F, 11.0F, 9.0F, 0.0F, false);
		Body.setTextureOffset(14, 45).addBox(-1.0F, -21.0F, -4.0F, 2.0F, 11.0F, 7.0F, 0.0F, false);
		Body.setTextureOffset(18, 93).addBox(-3.0F, -25.0F, -4.0F, 6.0F, 4.0F, 7.0F, 0.0F, false);
		Body.setTextureOffset(11, 109).addBox(-2.0F, -1.0F, -16.0F, 4.0F, 4.0F, 12.0F, 0.0F, false);

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.setTextureOffset(53, 85).addBox(-11.0F, -24.0F, -5.0F, 6.0F, 12.0F, 8.0F, 0.0F, false);
		RightArm.setTextureOffset(51, 60).addBox(-10.0F, -12.0F, -3.0F, 4.0F, 11.0F, 4.0F, 0.0F, false);
		RightArm.setTextureOffset(53, 85).addBox(-11.0F, -3.0F, -5.0F, 6.0F, 4.0F, 8.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.setTextureOffset(52, 59).addBox(6.0F, -12.0F, -3.0F, 4.0F, 9.0F, 4.0F, 0.0F, false);
		LeftArm.setTextureOffset(53, 85).addBox(5.0F, -24.0F, -5.0F, 6.0F, 12.0F, 8.0F, 0.0F, false);
		LeftArm.setTextureOffset(53, 85).addBox(5.0F, -3.0F, -5.0F, 6.0F, 4.0F, 8.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(3.9F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(100, 101).addBox(-2.0F, -1.0F, -3.0F, 5.0F, 10.0F, 5.0F, 0.0F, false);
		LeftLeg.setTextureOffset(15, 71).addBox(-3.0F, -11.0F, -4.0F, 7.0F, 10.0F, 7.0F, 0.0F, false);
		LeftLeg.setTextureOffset(89, 74).addBox(-3.0F, 8.0F, -6.0F, 7.0F, 4.0F, 9.0F, 0.0F, false);

		Rightleg = new ModelRenderer(this);
		Rightleg.setRotationPoint(-5.1F, 12.0F, 0.0F);
		Rightleg.setTextureOffset(89, 74).addBox(-2.0F, -1.0F, -3.0F, 5.0F, 10.0F, 5.0F, 0.0F, false);
		Rightleg.setTextureOffset(89, 74).addBox(-3.0F, 8.0F, -6.0F, 7.0F, 4.0F, 9.0F, 0.0F, false);
		Rightleg.setTextureOffset(75, 52).addBox(-3.0F, -11.0F, -4.0F, 7.0F, 10.0F, 7.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
		Body.render(matrixStack, buffer, packedLight, packedOverlay);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay);
		Rightleg.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.Rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}