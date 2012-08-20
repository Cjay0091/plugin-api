/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.game.model;

import com.evelus.frontier.game.model.mob.ServerBindings;
import com.evelus.frontier.listeners.game.EffectListener;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public interface Mob {

    /**
     * Registers an effect to this mob.
     *
     * @param listener The effect listener.
     */
    public void registerEffect(EffectListener listener);

    /**
     * Gets the server bindings for this player.
     *
     * @return The server bindings.
     */
    public ServerBindings getServerBindings();

}
