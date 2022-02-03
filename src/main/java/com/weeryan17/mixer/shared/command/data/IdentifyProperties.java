package com.weeryan17.mixer.shared.command.data;

import com.google.gson.JsonObject;
import com.weeryan17.mixer.shared.command.meta.ClientType;
import com.weeryan17.mixer.shared.command.meta.CommandData;

import java.util.Optional;

public class IdentifyProperties implements CommandData {

    private String name;
    private ClientType type;
    private String id;

    private Optional<JsonObject> other = Optional.empty();

    public IdentifyProperties(String name, ClientType type, String id) {
        this.name = name;
        this.type = type;
        this.id = id;
    }

    public IdentifyProperties(String name, ClientType type, String id, JsonObject other) {
        this.name = name;
        this.type = type;
        this.id = id;
        this.other = Optional.of(other);
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

    public Optional<JsonObject> getOther() {
        return other;
    }

    public void setOther(Optional<JsonObject> other) {
        this.other = other;
    }
}
