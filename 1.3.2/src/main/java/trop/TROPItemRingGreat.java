package trop;

import static trop.TROPObfuscationHelper.addPotionEffect;

import java.util.List;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.*;

public class TROPItemRingGreat extends TROPItemRingBase {
	public TROPItemRingGreat(int id) {
		super(id);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, List info) {
		for (Potion potion: new Potion[] { Potion.invisibility }) {
			PotionEffect potioneffect = new PotionEffect(new PotionEffect(potion.getId(), 20, 1));
			String s1 = StatCollector.translateToLocal(potioneffect.getEffectName()).trim();
			info.add("\u00A72" + s1);
		}
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entity) {
		addPotionEffect(entity, new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		return super.onItemRightClick(itemStack, world, entity);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer) {
			addPotionEffect((EntityPlayer) entity, new PotionEffect(Potion.invisibility.getId(), 20, 2));
		}
	}
}
