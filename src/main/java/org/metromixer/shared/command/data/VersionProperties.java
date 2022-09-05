package org.metromixer.shared.command.data;

import org.metromixer.shared.command.meta.CommandData;
import org.metromixer.shared.models.Version;

public class VersionProperties implements CommandData {

    private Version serverVersion;
    private Version audioVersion;
    private Version apiVersion;

    public VersionProperties(Version serverVersion, Version audioVersion, Version apiVersion) {
        this.serverVersion = serverVersion;
        this.audioVersion = audioVersion;
        this.apiVersion = apiVersion;
    }

    public Version getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(Version serverVersion) {
        this.serverVersion = serverVersion;
    }

    public Version getAudioVersion() {
        return audioVersion;
    }

    public void setAudioVersion(Version audioVersion) {
        this.audioVersion = audioVersion;
    }

    public Version getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(Version apiVersion) {
        this.apiVersion = apiVersion;
    }
}
