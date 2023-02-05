package trop

import net.minecraft.world.InteractionHand
import net.minecraft.world.InteractionResultHolder
import net.minecraft.world.effect.MobEffectInstance
import net.minecraft.world.effect.MobEffects
import net.minecraft.world.entity.Entity
import net.minecraft.world.entity.player.Player
import net.minecraft.world.item.ItemStack
import net.minecraft.world.level.Level

class TROPItemRingVilia : TROPItemRingBase() {
    override fun inventoryTick(itemstack: ItemStack, world: Level, entity: Entity, par4: Int, par5: Boolean) {
        if (entity is Player) {
            entity.addEffect(MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2))
            entity.addEffect(MobEffectInstance(MobEffects.JUMP, 20, 2))
        }
    }

    override fun use(world: Level, entity: Player, hand: InteractionHand): InteractionResultHolder<ItemStack> {
        entity.addEffect(MobEffectInstance(MobEffects.REGENERATION, 3600, 2))
        entity.addEffect(MobEffectInstance(MobEffects.HEALTH_BOOST, 3800, 2))
        return super.use(world, entity, hand)
    }
}
