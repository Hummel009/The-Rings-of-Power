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

public class TROPItemRingDwarf extends TROPItemRingBase {
	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack stack, World world, List<ITextComponent> info, ITooltipFlag flag) {
		for (Effect effect: new Effect[] { Effects.DIG_SPEED, Effects.DAMAGE_RESISTANCE }) {
			EffectInstance potioneffect = new EffectInstance(effect, 20, 1);
			info.add(new TranslationTextComponent(potioneffect.getDescriptionId()).withStyle(TextFormatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).addEffect(new EffectInstance(Effects.DIG_SPEED, 20, 1));
			((PlayerEntity) entity).addEffect(new EffectInstance(Effects.DAMAGE_RESISTANCE, 20, 1));
		}
	}

	@Override
	public ActionResult<ItemStack> use(World world, PlayerEntity entity, Hand hand) {
		entity.addEffect(new EffectInstance(Effects.REGENERATION, 3600, 2));
		entity.addEffect(new EffectInstance(Effects.HEALTH_BOOST, 3800, 2));
		return super.use(world, entity, hand);
	}
}
