package com.weeryan17.mixer.shared.models;

public class ChannelInfo {

    private int id;
    private String name;
    private ChannelType type;

    public ChannelInfo(String name, ChannelType type) {
        this.name = name;
        this.type = type;
    }

    public ChannelInfo(int id, String name, ChannelType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChannelType getType() {
        return type;
    }

    public void setType(ChannelType type) {
        this.type = type;
    }
}
