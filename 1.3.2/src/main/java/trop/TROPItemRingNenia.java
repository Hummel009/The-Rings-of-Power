package trop;

import net.minecraft.src.*;

public class TROPItemRingNenia extends TROPItemRingBase {
	public TROPItemRingNenia(int id) {
		super(id);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entity) {
		TROPObfuscationHelper.addPotionEffect(entity, new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entity);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer) {
			TROPObfuscationHelper.addPotionEffect((EntityPlayer) entity, new PotionEffect(Potion.waterBreathing.getId(), 20, 0));
		}
	}
}
