package trop;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class TROPObfuscationHelper {
	public static void addPotionEffect(EntityLiving entityLiving, PotionEffect potionEffect) {
		try {
			ReflectionHelper.findMethod(EntityLiving.class, null, new String[]{"b"}, PotionEffect.class).invoke(entityLiving, potionEffect);
		} catch (Exception e) {
			entityLiving.addPotionEffect(potionEffect);
		}
	}

	public static void setCreativeTab(Item item, CreativeTabs creativeTabs) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, TROPCreativeTabs.TAB_RINGS, "a");
		} catch (Exception e) {
			item.setCreativeTab(TROPCreativeTabs.TAB_RINGS);
		}
	}

	public static void setIconIndex(Item item, int i) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, i, "cl");
		} catch (Exception e) {
			item.setIconIndex(i);
		}
	}

	public static void setItemName(Item item, String s) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, "item." + s, "cp");
		} catch (Exception e) {
			item.setItemName(s);
		}
	}

	public static void setMaxDamage(Item item, int i) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, 0, "b");
		} catch (Exception e) {
			item.setMaxDamage(0);
		}
	}

	public static void setMaxStackSize(Item item, int i) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, 1, "ck");
		} catch (Exception e) {
			item.setMaxStackSize(1);
		}
	}
}