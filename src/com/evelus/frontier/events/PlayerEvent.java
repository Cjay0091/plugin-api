/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */
package com.evelus.frontier.events;

import com.evelus.frontier.game.model.Player;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public class PlayerEvent implements Event<Player> {

    /**
     * Constructs a new {@link PlayerEvent};
     */
    public PlayerEvent(Player source) {
        this.source = source;
    }
    
    /**
     * The source of this event.
     */
    private Player source;

    /**
     * Gets the source of this event.
     *
     * @return The source of this event.
     */
    @Override
    public Player getSource() {
        return source;
    }
}
