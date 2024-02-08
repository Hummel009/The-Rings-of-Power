package trop.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class ItemRingGreat extends ItemRingBase {
	public ItemRingGreat(int id) {
		super(id);
	}

	@Override
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List list, boolean b) {
		for (Potion potion : new Potion[]{Potion.invisibility}) {
			list.add(EnumChatFormatting.DARK_GREEN + StatCollector.translateToLocal(potion.getName()).trim());
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entityPlayer);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		if (entity instanceof EntityLiving) {
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.invisibility.getId(), 20, 2));
		}
	}
}
