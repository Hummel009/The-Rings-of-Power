package trop;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

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
