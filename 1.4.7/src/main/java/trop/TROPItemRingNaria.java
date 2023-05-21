package trop;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class TROPItemRingNaria extends Item {
	public TROPItemRingNaria(int par1) {
		super(par1);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entity) {
		entity.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entity);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20));
		}
	}
}