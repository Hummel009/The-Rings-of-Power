package trop;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
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

public class TROPItemRingNarya extends Item {
	@Override
	@SideOnly(Side.CLIENT)
	@SuppressWarnings("deprecation")
	public void addInformation(ItemStack itemStack, World world, List<String> list, ITooltipFlag tooltipFlag) {
		for (Potion potion : new Potion[]{MobEffects.FIRE_RESISTANCE}) {
			list.add(ChatFormatting.DARK_GREEN + I18n.translateToLocal(potion.getName()).trim());
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand hand) {
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 2));
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 3800, 2));
		return super.onItemRightClick(world, entityPlayer, hand);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		if (entity instanceof EntityLivingBase) {
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 20));
		}
	}
}