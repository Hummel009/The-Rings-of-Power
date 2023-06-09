package trop;

import java.util.List;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.*;
import net.minecraft.potion.*;
import net.minecraft.util.*;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.*;

public class TROPItemRingDwarf extends Item {
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, World world, List<String> info, ITooltipFlag flag) {
		for (Potion effect: new Potion[] { MobEffects.RESISTANCE, MobEffects.MINING_FATIGUE }) {
			PotionEffect potioneffect = new PotionEffect(new PotionEffect(effect, 20, 1));
			String s1 = I18n.translateToLocal(potioneffect.getEffectName()).trim();
			info.add(ChatFormatting.DARK_GREEN + s1);
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
		entity.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 2));
		entity.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 3800, 2));
		return super.onItemRightClick(world, entity, hand);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 20, 1));
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.MINING_FATIGUE, 20, 1));
		}
	}
}
