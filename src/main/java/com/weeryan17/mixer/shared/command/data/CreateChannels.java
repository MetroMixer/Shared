package com.weeryan17.mixer.shared.command.data;

import com.weeryan17.mixer.shared.command.meta.CommandData;
import com.weeryan17.mixer.shared.models.ChannelInfo;

import java.util.ArrayList;
import java.util.List;

public class CreateChannels implements CommandData {

    private List<ChannelInfo> channels;

    public CreateChannels(List<ChannelInfo> channels) {
        this.channels = channels;
    }

    public List<ChannelInfo> getChannels() {
        return channels;
    }

    public void setChannels(List<ChannelInfo> channels) {
        this.channels = channels;
    }
}
