package trop;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class TROPItemRingNenya extends TROPItemRingBase {
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack itemStack, @Nullable World world, List<ITextComponent> list, ITooltipFlag tooltipFlag) {
		for (Potion potion : new Potion[]{MobEffects.WATER_BREATHING}) {
			list.add(new TextComponentTranslation(potion.getName()).applyTextStyle(TextFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 20));
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand hand) {
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 3600, 2));
		entityPlayer.addPotionEffect(new PotionEffect(MobEffects.HEALTH_BOOST, 3800, 2));
		return super.onItemRightClick(world, entityPlayer, hand);
	}
}
