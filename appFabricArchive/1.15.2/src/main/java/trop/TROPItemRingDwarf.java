package trop;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.List;

public class TROPItemRingDwarf extends TROPItemRingBase {
	@Override
	public void appendTooltip(ItemStack itemStack, World world, List<Text> list, TooltipContext tooltipContext) {
		for (StatusEffect statusEffect : new StatusEffect[]{StatusEffects.HASTE, StatusEffects.RESISTANCE}) {
			list.add(new TranslatableText(statusEffect.getTranslationKey()).formatted(Formatting.DARK_GREEN));
		}
	}

	@Override
	public void inventoryTick(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20, 1));
			((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 20, 1));
		}
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
		playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 3600, 2));
		playerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 3800, 2));
		return super.use(world, playerEntity, hand);
	}
}
