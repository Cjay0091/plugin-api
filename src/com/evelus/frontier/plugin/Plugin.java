/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.plugin;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public interface Plugin {
    
    /**
     * The method to call upon loading the plugin.
     * 
     * @param pluginController The plugin controller that this plugin is being loaded from.
     */
    public void onLoad( PluginController pluginController );
    
    /**
     * Gets the name of this plugin.
     * 
     * @return The name of this plugin. 
     */
    public String getName( );

}
