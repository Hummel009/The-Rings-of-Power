package trop;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class TROPItemRingVilya extends TROPItemRingBase {
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack itemStack, @Nullable World world, List<ITextComponent> list, ITooltipFlag tooltipFlag) {
		for (Effect effect : new Effect[]{Effects.SPEED, Effects.JUMP_BOOST}) {
			list.add(new TranslationTextComponent(effect.getName()).applyTextStyle(TextFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		if (entity instanceof PlayerEntity) {
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SPEED, 20, 1));
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 20, 1));
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity playerEntity, Hand hand) {
		playerEntity.addPotionEffect(new EffectInstance(Effects.REGENERATION, 3600, 2));
		playerEntity.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, 3800, 2));
		return super.onItemRightClick(world, playerEntity, hand);
	}
}
