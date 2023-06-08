package trop;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class TROPItemRingNaria extends Item {
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entity) {
		entity.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 3600, 2));
		entity.addPotionEffect(new PotionEffect(Potion.field_76434_w.getId(), 3800, 2));
		return super.onItemRightClick(itemStack, world, entity);
	}

	@Override
	public void onUpdate(ItemStack itemstack, World world, Entity entity, int par4, boolean par5) {
		if (entity instanceof EntityPlayer) {
			((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.fireResistance.getId(), 20));
		}
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack itemstack, EntityPlayer entityplayer, List<String> info, boolean sus) {
		for (Potion p : new Potion[]{Potion.fireResistance}) {
			PotionEffect potioneffect = new PotionEffect(new PotionEffect(p.getId(), 20, 1));
			String s1 = StatCollector.translateToLocal(potioneffect.getEffectName()).trim();
			info.add(EnumChatFormatting.GRAY + s1);
		}
	}
}