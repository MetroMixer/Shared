package com.weeryan17.mixer.shared.command.data;

import com.google.gson.JsonObject;
import com.weeryan17.mixer.shared.command.meta.ClientType;
import com.weeryan17.mixer.shared.command.meta.CommandData;

public class IdentifyProperties implements CommandData {

    private String name;
    private ClientType type;
    private String id;

    private JsonObject other;

    public IdentifyProperties(String name, ClientType type, String id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public IdentifyProperties(String name, ClientType type, String id, JsonObject other) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.other = other;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientType getType() {
        return type;
    }

    public void setType(ClientType type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JsonObject getOther() {
        return other;
    }

    public void setOther(JsonObject other) {
        this.other = other;
    }
}
