package org.metromixer.shared.command.data;

import org.metromixer.shared.command.meta.CommandData;
import org.metromixer.shared.models.ChannelInfo;

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
