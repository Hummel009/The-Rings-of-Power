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

	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entity) {
		return itemStack;
	}

	public ItemStack a(ItemStack itemStack, World world, EntityPlayer entity) {
		return onItemRightClick(itemStack, world, entity);
	}

	public void a(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		onUpdate(itemstack, world, entity, par4, par5);
	}

	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
	}
}
