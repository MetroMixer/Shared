package com.weeryan17.mixer.shared.command.data;

import com.weeryan17.mixer.shared.command.meta.CommandData;

public class Init implements CommandData {

    private long heartbeat;
    private int udpPort;
    private String id;

    public Init(long heartbeat, int udpPort, String id) {
        this.heartbeat = heartbeat;
        this.udpPort = udpPort;
        this.id = id;
    }

    public long getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(long heartbeat) {
        this.heartbeat = heartbeat;
    }

    public int getUdpPort() {
        return udpPort;
    }

    public void setUdpPort(int udpPort) {
        this.udpPort = udpPort;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
