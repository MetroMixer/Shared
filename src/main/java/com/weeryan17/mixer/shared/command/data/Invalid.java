package com.weeryan17.mixer.shared.command.data;

import com.weeryan17.mixer.shared.command.meta.CommandData;

public class Invalid implements CommandData {

    private int code;
    private String reason;
    private boolean disconnect;

    public Invalid(int code, String reason, boolean disconnect) {
        this.code = code;
        this.reason = reason;
        this.disconnect = disconnect;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public boolean shouldDisconnect() {
        return disconnect;
    }

    public void setDisconnect(boolean disconnect) {
        this.disconnect = disconnect;
    }
}
