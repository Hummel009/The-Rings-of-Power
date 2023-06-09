package trop;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class TROPItemRingBase extends Item {
	public TROPItemRingBase(int id) {
		super(id);
	}

	public void a(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		onUpdate(itemStack, world, entity, i, b);
	}

	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean b) {
	}

	public void a(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean b) {
		addInformation(itemStack, entityPlayer, list, b);
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