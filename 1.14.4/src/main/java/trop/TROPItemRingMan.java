package trop;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.*;
import net.minecraft.util.*;
import net.minecraft.util.text.*;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.*;

public class TROPItemRingMan extends TROPItemRingBase {
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World world, List<ITextComponent> info, ITooltipFlag flag) {
		for (Effect effect: new Effect[] { Effects.STRENGTH, Effects.NIGHT_VISION }) {
			EffectInstance potioneffect = new EffectInstance(effect, 20, 1);
			info.add(new TranslationTextComponent(potioneffect.getEffectName()).applyTextStyle(TextFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).addPotionEffect(new EffectInstance(Effects.STRENGTH, 20, 1));
			((PlayerEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 220));
		}
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
		entity.addPotionEffect(new EffectInstance(Effects.REGENERATION, 3600, 2));
		entity.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, 3800, 2));
		return super.onItemRightClick(world, entity, hand);
	}
}
