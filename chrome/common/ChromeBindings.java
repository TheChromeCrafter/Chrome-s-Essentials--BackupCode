package chrome.common;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;

public class ChromeBindings extends Item {

	public ChromeBindings(int par1) {
		super(par1);
		
	}		
		@SideOnly(Side.CLIENT)
		public void registerIcons(IconRegister reg){
			this.itemIcon = reg.registerIcon("chrome_mods:chrome_bindings");
	}

}
