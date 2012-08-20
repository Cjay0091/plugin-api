/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.events.game;

import com.evelus.frontier.events.Event;
import com.evelus.frontier.game.model.Mob;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public final class EffectEvent implements Event {

    /**
     * Constructs a new {@link EffectEvent};
     *
     * @param source The source of the event.
     */
    public EffectEvent(Mob source) {
        this.source = source;
    }

    /**
     * The source of this event.
     */
    private Mob source;

    /**
     * Gets the source of this event.
     * 
     * @return The source of the event.
     */
    @Override
    public Mob getSource() {
        return source;
    }
}