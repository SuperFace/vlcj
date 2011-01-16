/*
 * This file is part of VLCJ.
 *
 * VLCJ is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * VLCJ is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * afloat with VLCJ.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Copyright 2009, 2010 Caprica Software Limited.
 */

package uk.co.caprica.vlcj.player.events;

import uk.co.caprica.vlcj.player.MediaPlayer;
import uk.co.caprica.vlcj.player.MediaPlayerEventListener;

/**
 *
 */
class MediaPlayerPositionChangedEvent extends AbstractMediaPlayerEvent {

  /**
   * New position, a percentage.
   */
  private final float newPosition;
  
  /**
   * Create a media player event.
   * 
   * @param mediaPlayer media player the event relates to
   * @param newPosition a percentage
   */
  MediaPlayerPositionChangedEvent(MediaPlayer mediaPlayer, float newPosition) {
    super(mediaPlayer);
    this.newPosition = newPosition;
  }
  
  @Override
  public void notify(MediaPlayerEventListener listener) {
    listener.positionChanged(mediaPlayer, newPosition);
  }
}
