/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.events.widgets;

import com.evelus.frontier.events.PlayerEvent;
import com.evelus.frontier.game.model.Player;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public final class WidgetEvent extends PlayerEvent {

    /**
     * Constructs a new {@link WidgetEvent};
     *
     * @param source The source of this event.
     */
    public WidgetEvent ( Player source )
    {
        super( source );
    }
}
