package trop;

import static trop.TROPObfuscationHelper.addPotionEffect;

import java.util.List;

import cpw.mods.fml.relauncher.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.*;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class TROPItemRingMan extends TROPItemRingBase {
	public TROPItemRingMan(int id) {
		super(id);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List info, boolean sus) {
		for (Potion effect: new Potion[] { Potion.damageBoost, Potion.nightVision }) {
			PotionEffect potioneffect = new PotionEffect(new PotionEffect(effect.getId(), 20, 1));
			String s1 = StatCollector.translateToLocal(potioneffect.getEffectName()).trim();
			info.add("\u00A72" + s1);
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entity) {
		addPotionEffect(entity, new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entity);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer) {
			addPotionEffect((EntityPlayer) entity, new PotionEffect(Potion.damageBoost.getId(), 20, 1));
			addPotionEffect((EntityPlayer) entity, new PotionEffect(Potion.nightVision.getId(), 220));
		}
	}
}
