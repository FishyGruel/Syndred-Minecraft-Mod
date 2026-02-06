/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.syndred.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.syndred.client.gui.SunderGUIScreen;
import net.mcreator.syndred.client.gui.AnimaConfluxGUIScreen;

@EventBusSubscriber(Dist.CLIENT)
public class SyndredModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(SyndredModMenus.SUNDER_GUI.get(), SunderGUIScreen::new);
		event.register(SyndredModMenus.ANIMA_CONFLUX_GUI.get(), AnimaConfluxGUIScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}