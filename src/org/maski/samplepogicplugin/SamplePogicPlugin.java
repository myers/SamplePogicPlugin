package org.maski.samplepogicplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.maski.pogic.Pogic;

public class SamplePogicPlugin extends JavaPlugin {
	Pogic pogic;
	
	@Override
	public void onEnable() {
		pogic = (Pogic)getServer().getPluginManager().getPlugin("Pogic");
		pogic.addEntity("Creeper2", EntityCreeper2.class);
		
	}

	@Override
	public void onDisable() {
		pogic.removeEntity("Creeper2");
	}


}
