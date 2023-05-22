package trop;

import net.minecraft.src.Entity;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.World;

public class TROPItemRingMan extends Item {
	public TROPItemRingMan(int id) {
		super(id);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entity) {
		entity.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entity);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 20, 1));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 220, 0));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 1));
		}
	}
}
