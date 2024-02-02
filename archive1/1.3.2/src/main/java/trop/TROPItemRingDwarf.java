package trop;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

import java.util.List;

public class TROPItemRingDwarf extends TROPItemRingBase {
	public TROPItemRingDwarf(int id) {
		super(id);
	}

	@Override
	@SideOnly(Side.CLIENT)
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
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		if (entity instanceof EntityLiving) {
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 20, 1));
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.resistance.getId(), 20, 1));
		}
	}
}