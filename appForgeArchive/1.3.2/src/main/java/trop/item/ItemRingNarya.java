package trop.item;

import net.minecraft.src.*;

import java.util.List;

public class ItemRingNarya extends ItemRingBase {
	public ItemRingNarya(int id) {
		super(id);
	}

	@Override
	public void addInformation(ItemStack itemStack, List list) {
		for (Potion potion : new Potion[]{Potion.fireResistance}) {
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
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20));
		}
	}
}