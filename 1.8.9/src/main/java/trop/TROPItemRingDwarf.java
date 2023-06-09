package trop;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.util.*;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.*;

public class TROPItemRingDwarf extends Item {
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List<String> info, boolean sus) {
		for (Potion effect: new Potion[] { Potion.digSpeed, Potion.resistance }) {
			PotionEffect potioneffect = new PotionEffect(new PotionEffect(effect.getId(), 20, 1));
			String s1 = StatCollector.translateToLocal(potioneffect.getEffectName()).trim();
			info.add(EnumChatFormatting.DARK_GREEN + s1);
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entity) {
		entity.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		entity.addPotionEffect(new PotionEffect(Potion.healthBoost.getId(), 3800, 2));
		return super.onItemRightClick(itemStack, world, entity);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 20, 1));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 1));
		}
	}
}
