package kolo.mod.proj.life.items;

import kolo.mod.proj.life.ProjectModLife;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.item.Item;

public class ItemMain extends Item
{
	public String name;
	public boolean isUsable;
	
	public ItemMain(Item obj, String name, boolean isUsable)
	{
		super();
		GameRegistry.registerItem(obj, name, ProjectModLife.MODID);
		LanguageRegistry.addName(obj, name);
	}

}
