package trop;

import cpw.mods.fml.relauncher.ReflectionHelper;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.Item;
import net.minecraft.src.PotionEffect;

public class TROPReflectionHelper {
	public static void setIconIndex(Item item, int value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, value, "bV");
		} catch (Exception e) {
			item.setIconIndex(value);
		}
	}

	public static void setItemName(Item item, String value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, "item." + value, "bZ");
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
			ReflectionHelper.setPrivateValue(Item.class, item, 1, "bU");
		} catch (Exception e) {
			item.setMaxStackSize(1);
		}
	}

	public static void setCreativeTab(Item item, CreativeTabs value) {
		try {
			ReflectionHelper.setPrivateValue(Item.class, item, TROPCreativeTabs.TAB_RINGS, "a");
		} catch (Exception e) {
			item.setCreativeTab(TROPCreativeTabs.TAB_RINGS);
		}
	}

	public static void addPotionEffect(EntityLiving entity, PotionEffect effect) {
		try {
			ReflectionHelper.findMethod(EntityLiving.class, null, new String[]{"d"}, PotionEffect.class).invoke(entity, effect);
		} catch (Exception e) {
			entity.addPotionEffect(effect);
		}
	}
}