package com.weeryan17.mixer.shared.command.data;

import com.weeryan17.mixer.shared.command.meta.CommandData;

import java.util.Optional;

public class Init implements CommandData {

    private long heartbeat;
    private int udpPort;
    private Optional<String> key = Optional.empty();

    public Init(long heartbeat, int udpPort) {
        this.heartbeat = heartbeat;
        this.udpPort = udpPort;
    }

    public Init(long heartbeat, int udpPort, String key) {
        this.heartbeat = heartbeat;
        this.udpPort = udpPort;
        this.key = Optional.of(key);
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

    public Optional<String> getKey() {
        return key;
    }
}
