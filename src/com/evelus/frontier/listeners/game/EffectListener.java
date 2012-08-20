/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.listeners.game;

import com.evelus.frontier.events.game.EffectEvent;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public interface EffectListener {

    /**
     * Called upon activation for this effect.
     *
     * @param event The effect event.
     */
    public void onActivate(EffectEvent event);

    /**
     * Called upon update for this effect.
     * 
     * @param event The effect event.
     * @return If the effect should continue to persist.
     */
    public boolean onUpdate(EffectEvent event);

}