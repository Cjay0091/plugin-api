/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.listeners.items;

import com.evelus.frontier.events.items.ItemEvent;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public interface ItemListener {

    /**
     * Called when this item is requested to be equipped.
     *
     * @param event The item event.
     */
    public void onEquip( ItemEvent event );

}
