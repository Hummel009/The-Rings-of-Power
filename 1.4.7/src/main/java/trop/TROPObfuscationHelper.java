package trop;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

public class TROPObfuscationHelper {
	public static void addPotionEffect(EntityLiving entity, PotionEffect effect) {
		try {
			ReflectionHelper.findMethod(EntityLiving.class, null, new String[] { "b" }, PotionEffect.class).invoke(entity, effect);
		} catch (Exception e) {
			entity.addPotionEffect(effect);
		}
	}

	public static void setCreativeTab(Item item, CreativeTabs value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, TROPCreativeTabs.TAB_RINGS, "a");
		} catch (Exception e) {
			item.setCreativeTab(TROPCreativeTabs.TAB_RINGS);
		}
	}

	public static void setIconIndex(Item item, int value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, value, "cl");
		} catch (Exception e) {
			item.setIconIndex(value);
		}
	}

	public static void setItemName(Item item, String value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, "item." + value, "cp");
		} catch (Exception e) {
			item.setItemName(value);
		}
	}

	public static void setMaxDamage(Item item, int value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, 0, "b");
		} catch (Exception e) {
			item.setMaxDamage(0);
		}
	}

	public static void setMaxStackSize(Item item, int value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, 1, "ck");
		} catch (Exception e) {
			item.setMaxStackSize(1);
		}
	}
}