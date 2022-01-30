// Made with Blockbench 4.1.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class Modelcz_straighthelm extends EntityModel<Entity> {
	private final ModelRenderer Head;

	public Modelcz_straighthelm() {
		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.setTextureOffset(0, 0).addBox(-5.0F, -8.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(4.0F, -8.0F, -5.0F, 1.0F, 7.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-1.0F, -8.0F, -5.0F, 2.0F, 5.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -5.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(1.0F, -8.0F, -5.0F, 3.0F, 2.0F, 1.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-6.0F, -10.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(5.0F, -10.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(6.0F, -9.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-7.0F, -9.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-8.0F, -14.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-7.0F, -16.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(6.0F, -14.0F, -2.0F, 2.0F, 5.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(-6.0F, -18.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(5.0F, -18.0F, -2.0F, 1.0F, 5.0F, 3.0F, 0.0F, false);
		Head.setTextureOffset(0, 0).addBox(6.0F, -16.0F, -2.0F, 1.0F, 2.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Head.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.Head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}