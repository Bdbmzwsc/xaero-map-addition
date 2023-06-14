package com.plusls.xma.compat.modmenu;

import com.plusls.xma.ModInfo;
import com.plusls.xma.gui.GuiConfigs;
import top.hendrixshen.magiclib.compat.modmenu.ModMenuCompatApi;

public class ModMenuApiImpl implements ModMenuCompatApi {
    @Override
    public ConfigScreenFactoryCompat<?> getConfigScreenFactoryCompat() {
        return (screen) -> {
            GuiConfigs gui = GuiConfigs.getInstance();
            //#if MC > 11903
            gui.setParent(screen);
            //#else
            //$$ gui.setParentGui(screen);
            //#endif
            return gui;
        };
    }

    @Override
    public String getModIdCompat() {
        return ModInfo.getCurrentModIdentifier();
    }

}