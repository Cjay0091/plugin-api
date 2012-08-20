/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */

package com.evelus.frontier.game.model.mob;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public interface ServerBindings {

    /**
     * Looks up the value of a state.
     *
     * @param name The name of the state to lookup the value for.
     * @return The value of the state.
     */
    public int lookup( String name );

    /**
     * Sets the value of a state.
     *
     * @param name The name of the state to set its value for.
     * @param i The value.
     */
    public void set( String name , int i );

}
