/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.events;

import com.evelus.frontier.game.model.Mob;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public interface Event<T extends Mob> {

    /**
     * Gets the source of the event.
     *
     * @return The source.
     */
    public T getSource();

}
