/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.listeners.widgets;

import com.evelus.frontier.events.widgets.WidgetEvent;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public interface WindowListener {

    /**
     * Called when the window is opened.
     *
     * @param event The widget event.
     */
    public void onOpen( WidgetEvent event );

    /**
     * Called when the window is closed.
     *
     * @param event The widget event.
     */
    public void onClose( WidgetEvent event );

}
