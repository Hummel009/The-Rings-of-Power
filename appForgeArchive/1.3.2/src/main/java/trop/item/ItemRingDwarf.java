package trop.item;

import net.minecraft.src.*;

import java.util.List;

public class ItemRingDwarf extends ItemRingBase {
	public ItemRingDwarf(int id) {
		super(id);
	}

	@Override
	public void addInformation(ItemStack itemStack, List list) {
		for (Potion potion : new Potion[]{Potion.digSpeed, Potion.resistance}) {
			list.add("§2" + StatCollector.translateToLocal(potion.getName()).trim());
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entityPlayer);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean selected) {
		if (entity instanceof EntityLiving) {
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 20, 1));
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 1));
		}
	}
}
