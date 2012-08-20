/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.game.items;

import com.evelus.frontier.listeners.items.ItemListener;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public interface ItemController {

    /**
     * Registers an item listener to this item controller.
     *
     * @param listener The listener to register.
     * @param id The id of the listener to register.
     */
    public void register( ItemListener listener , int id );

}
