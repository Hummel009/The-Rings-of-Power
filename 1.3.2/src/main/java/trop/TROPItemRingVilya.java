package trop;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

import java.util.List;

public class TROPItemRingVilya extends Item {
	public TROPItemRingVilya(int id) {
		super(id);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemStack, List list) {
		for (Potion potion : new Potion[]{Potion.moveSpeed, Potion.jump}) {
			list.add("\u00A72" + StatCollector.translateToLocal(potion.getName()).trim());
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
		entityPlayer.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entityPlayer);
	}

	@Override
	public void onUpdate(ItemStack itemStack, World world, Entity entity, int i, boolean b) {
		if (entity instanceof EntityPlayer) {
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 20, 1));
			((EntityLiving) entity).addPotionEffect(new PotionEffect(Potion.jump.getId(), 20, 1));
		}
	}
}
