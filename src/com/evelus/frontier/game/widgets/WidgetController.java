/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.game.widgets;

import com.evelus.frontier.listeners.widgets.ButtonListener;
import com.evelus.frontier.listeners.widgets.WindowListener;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public interface WidgetController {

    /**
     * Registers a button listener to this widget controller.
     * 
     * @param listener The listener to register to this controller.
     * @param id The id of the listener to register.
     */
    public void register( ButtonListener listener , int id );

    /**
     * Registers a window listener to this widget controller.
     *
     * @param listener The listener to register to this controller.
     * @param id The id of the listener tor egister.
     */
    public void register( WindowListener listener , int id );
}
