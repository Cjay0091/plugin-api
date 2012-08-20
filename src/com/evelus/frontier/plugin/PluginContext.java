/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.plugin;

import com.evelus.frontier.game.items.ItemController;
import com.evelus.frontier.game.widgets.WidgetController;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public final class PluginContext {
    
    /**
     * The widget controller for this plugin context.
     */
    private WidgetController widgetController;

    /**
     * The item controller for this plugin context.
     */
    private ItemController itemController;
    
    /**
     * Provides the context with the widget controller.
     * 
     * @param widgetController The widget controller for this context.
     */
    public void provideWidgetController( WidgetController widgetController )
    {
        this.widgetController = widgetController;
    }
    
    /**
     * Gets the widget controller for this plugin context.
     * 
     * @return The widget controller.
     */
    public WidgetController getWidgetController( )
    {
        return widgetController;
    }

    /**
     * Provides the context with the item controller.
     *
     * @param itemController The item controller for this context.
     */
    public void provideItemController( ItemController itemController )
    {
        this.itemController = itemController;
    }

    /**
     * Gets the item controller for this plugin context.
     *
     * @return The item controller.
     */
    public ItemController getItemController( )
    {
        return itemController;
    }
}
