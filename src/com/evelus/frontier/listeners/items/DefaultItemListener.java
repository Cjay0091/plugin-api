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
public class DefaultItemListener implements ItemListener {

    @Override
    public void onEquip( ItemEvent event ) 
    {
        System.out.println( "I LOVE TITTIES" );
    }
}