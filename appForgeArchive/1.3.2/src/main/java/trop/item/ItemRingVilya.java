package trop.item;

import net.minecraft.src.*;

import java.util.List;

public class ItemRingVilya extends ItemRing {
	public ItemRingVilya(int id) {
		super(id);
	}

	@Override
	public void addInformation(ItemStack itemStack, List list) {
		for (Potion potion : new Potion[]{Potion.moveSpeed, Potion.jump}) {
			list.add("§2" + StatCollector.translateToLocal(potion.getName()).trim());
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entityPlayer);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int slot, boolean selected) {
		if (entity instanceof EntityLiving) {
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 1));
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.jump.getId(), 20, 1));
		}
	}
}
