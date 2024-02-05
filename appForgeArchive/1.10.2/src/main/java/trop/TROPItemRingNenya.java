package trop;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class TROPItemRingNenya extends TROPItemRingBase {
	@Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings("deprecation")
	public void addInformation(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean b) {
		for (Potion potion : new Potion[]{MobEffects.WATER_BREATHING}) {
			list.add(ChatFormatting.DARK_GREEN + I18n.translateToLocal(potion.getName()).trim());
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer, EnumHand hand) {
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 2));
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 3600, 2));
		return super.onItemRightClick(itemStack, world, entityPlayer, hand);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		if (entity instanceof EntityLivingBase) {
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 20));
		}
	}
}
