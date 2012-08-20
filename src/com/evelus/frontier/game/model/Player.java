/**
 * Copyright Evelus, All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Hadyn Richard (sini@evel.us), July 2012
 */
package com.evelus.frontier.game.model;

import com.evelus.frontier.game.model.mob.ServerBindings;

/**
 * Evelus Development
 * Created by Hadyn Richard
 */
public interface Player extends Mob {

    /**
     * Sends a message to the player.
     *
     * @param message The message to send.
     */
    public void sendMessage(String message);

    /**
     * Sets text for a widget.
     *
     * @param parentId The parent id of the widget to set the text for.
     * @param childId The child id of the widget to set the text for.
     * @param text The text to set for the widget.
     */
    public void setText(int parentId, int childId, String text);

    /**
     * Displays a window.
     *
     * @param id The id of the window to display.
     */
    public void displayWindow(int id);

    /**
     * Displays an overlay.
     *
     * @param parentId The parent id of the widget to display as the overlay.
     */
    public void displayOverlay(int parentId);

    /**
     * Displays only a tab and a window. Used for banking, the equipment window.
     *
     * @param tabId The parent id of the widget to display as the tab.
     * @param windowId The id of the window to display.
     */
    public void displayTabAndWindow(int tabId, int windowId);

    /**
     * Displays a chatbox overlay.
     *
     * @param parentId The parent id of the widget to display as the overlay.
     */
    public void displayChatboxInterface(int parentId);

    /**
     * Closes the displayed overlay widget.
     */
    public void closeOverlay();

    /**
     * Closes all the displayed widgets except for the chatbox overlay and overlay.
     */
    public void closeDisplayedWidgets();

}
