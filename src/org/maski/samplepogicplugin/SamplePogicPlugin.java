package org.maski.samplepogicplugin;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.craftbukkit.clientmod.ClientModManager;
import org.bukkit.plugin.java.JavaPlugin;

public class SamplePogicPlugin extends JavaPlugin {
	@Override
	public void onEnable() {
		ClientModManager cmm = ((CraftServer)getServer()).getClientModManager();
		cmm.addEntity(this, "BabyCreeper", EntityBabyCreeper.class);
	}

	@Override
	public void onDisable() {
	}
}
