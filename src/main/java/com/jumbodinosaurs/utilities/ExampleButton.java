package com.jumbodinosaurs.utilities;

import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.RadialMenuUtil;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.ResourceLocationUtil;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.buttons.ButtonAction;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.buttons.radial.RadialButton;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.buttons.radial.mainmenu.RadialMainMenuButton;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.gui.radialmenu.util.LabelCon;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.util.minecraft.GameHelper;
import net.minecraft.util.ResourceLocation;

public class ExampleButton extends RadialMainMenuButton
{
    @Override
    public RadialButton getRadialButton()
    {
        /* The code placed in a button action will be executed when that button is pressed
         * This example Action prints a message into chat and clears the screen
         * */
        ButtonAction exampleAction = new ButtonAction()
        {
            @Override
            public void onClick()
            {
                GameHelper.sendLocalMessage("Example Button Was Clicked");
                GameHelper.getInstance().displayGuiScreen(null);
            }
        };
        
        /* This is the label that will appear when draw on the screen
         * Note: By default the label here is used as the category for this button
         * to change the category you can over write the method getCategory()
         */
        String exampleLabel = "Example Button";
        /* The Resource Location here will be what is draw on the main menu
         */
        ResourceLocation exampleLocation = ResourceLocationUtil.boltIcon;
        LabelCon exampleLabelCon = new LabelCon(exampleLabel, exampleLocation, exampleAction);
        
        //To Make a regular or Centered button use RadialMenuUtil
        return RadialMenuUtil.getRadialButton(exampleLabelCon);
    }
    
    @Override
    public int getDefaultPriority()
    {
        /* The Main Menu Manager determines which buttons with the same category
         * to use by checking which button has the highest priority
         * Note: The Category by Default is Determined From the Radial Button's Label
         */
        return 0;
    }
}
