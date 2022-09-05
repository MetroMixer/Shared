package org.metromixer.shared.command.data;

import org.metromixer.shared.command.meta.CommandData;

public class Volume implements CommandData {

    private int channelId;
    private float volume;

    public Volume(int channelId, float volume) {
        this.channelId = channelId;
        this.volume = volume;
    }

    public int getChannelId() {
        return channelId;
    }

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

}
