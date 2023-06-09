package trop;

import net.minecraft.src.*;

import java.util.List;

public class TROPItemRingBase extends Item {
	public TROPItemRingBase(int id) {
		super(id);
	}

	public void a(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		onUpdate(itemStack, world, entity, i, b);
	}

	public void a(ItemStack itemStack, List list) {
		addInformation(itemStack, list);
	}

	public ItemStack a(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		return onItemRightClick(itemStack, world, entityPlayer);
	}

	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		return itemStack;
	}

	public void addInformation(ItemStack itemStack, List list) {
	}

	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
	}
}
