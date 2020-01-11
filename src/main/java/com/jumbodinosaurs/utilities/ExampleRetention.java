package com.jumbodinosaurs.utilities;

import com.jumbodinosaurs.mcdevlib.OneDotTwelve.retentions.BindableRentention;
import com.jumbodinosaurs.mcdevlib.OneDotTwelve.util.minecraft.GameHelper;
import net.minecraft.client.settings.KeyBinding;

public class ExampleRetention extends BindableRentention
{
    /*Extending the Retention class or BindableRetention class will enable the dev Library to find
     * and load your utility
     *
     *
     * Special Note: Placing a Forge SubscribeEvent in a class extending Retention or BindableRetention
     *  will be registered with forge's event bus by the dev library
     *
     * */
    public ExampleRetention(KeyBinding binding)
    {
        super(binding);
    }
    
    public ExampleRetention(boolean active, KeyBinding binding)
    {
        super(active, binding);
    }
    
    public ExampleRetention()
    {
    }
    
    @Override
    public String getModID()
    {
        /* The String returned here can be what ever you would like
         * Note: This is the title used to list it under in the Controls Menu
         */
        return "Example Utility";
    }
    
    @Override
    public void onPress()
    {
        /* For BindableRetentions
         * What would You like the utility to do when the key for it is pressed
         * Conventionally you would toggle the active status for the utility, but for example purposes
         * I've placed a hello world sort of message that displays in the chat*/
        //toggleActive();
        GameHelper.sendLocalMessage("Hello World");
    }
    
    @Override
    public String getInfoMessage()
    {
        /* Give a Description of what your utility does */
        return "Example Retention";
    }
    
    
}
