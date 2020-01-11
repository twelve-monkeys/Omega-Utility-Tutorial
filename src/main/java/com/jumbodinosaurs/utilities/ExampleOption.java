package com.jumbodinosaurs.utilities;

import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.ResourceLocationUtil;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.settings.Option;
import net.minecraft.util.ResourceLocation;

public class ExampleOption extends Option
{
    
    @Override
    public boolean getDefaultState()
    {
        /* When an option is first initialized the options manager
         * needs to know what the default state is
         */
        return false;
    }
    
    @Override
    public ResourceLocation getIcon()
    {
        //This will be the icon that appears when it's drawn in the option menu
        return ResourceLocationUtil.gearsIcon;
    }
    
    @Override
    public String getDisplayInfo()
    {
        /* When you hover over the button in the option menu this message will be displayed
         * */
        return "Is Active: " + isActive();
    }
}
