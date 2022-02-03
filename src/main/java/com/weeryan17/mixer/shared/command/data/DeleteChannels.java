package com.weeryan17.mixer.shared.command.data;

import com.weeryan17.mixer.shared.command.meta.CommandData;

import java.util.List;

public class DeleteChannels implements CommandData {

    List<Integer> channels;

    public DeleteChannels(List<Integer> channels) {
        this.channels = channels;
    }

    public List<Integer> getChannels() {
        return channels;
    }

    public void setChannels(List<Integer> channels) {
        this.channels = channels;
    }
}
