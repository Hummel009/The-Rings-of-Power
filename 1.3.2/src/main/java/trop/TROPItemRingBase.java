package trop;

import net.minecraft.src.*;

public class TROPItemRingBase extends Item {
	public TROPItemRingBase(int id) {
		super(id);
	}

	public void a(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		onUpdate(itemstack, world, entity, par4, par5);
	}

	public ItemStack a(ItemStack itemStack, World world, EntityPlayer entity) {
		return onItemRightClick(itemStack, world, entity);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entity) {
		return itemStack;
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
	}
}
