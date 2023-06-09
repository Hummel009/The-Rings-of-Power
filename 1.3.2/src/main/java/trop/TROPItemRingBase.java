package trop;

import net.minecraft.src.*;

public class TROPItemRingBase extends Item {
	public TROPItemRingBase(int id) {
		super(id);
	}

	public void a(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		onUpdate(itemStack, world, entity, i, b);
	}

	public ItemStack a(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		return onItemRightClick(itemStack, world, entityPlayer);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		return itemStack;
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
	}
}
