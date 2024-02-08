package trop.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class ItemRingMan extends ItemRingBase {
	public ItemRingMan(int id) {
		super(id);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean advanced) {
		for (Potion potion : new Potion[]{Potion.damageBoost, Potion.nightVision}) {
			list.add("§2" + StatCollector.translateToLocal(potion.getName()).trim());
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entityPlayer);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean selected) {
		if (entity instanceof EntityLiving) {
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 20, 1));
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 220));
		}
	}
}
