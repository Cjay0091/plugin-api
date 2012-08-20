/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */
package com.evelus.frontier.events.items;

import com.evelus.frontier.events.PlayerEvent;
import com.evelus.frontier.game.model.Player;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public final class ItemEvent extends PlayerEvent {

    /**
     * Constructs a new {@link ItemEvent};
     *
     * @param source The source of the item event.
     */
    public ItemEvent(Player source, int containerId, int slot) {
        super(source);
    }
    /**
     * The container id for the item affected.
     */
    private int containerId;
    /**
     * The slot of the affected item.
     */
    private int slot;

    /**
     * Gets the container id for the item affected.
     *
     * @return The container id.
     */
    public int getContainerId() {
        return containerId;
    }

    /**
     * Gets the slot for the item affected.
     *
     * @return The slot.
     */
    public int getSlot() {
        return slot;
    }
}
