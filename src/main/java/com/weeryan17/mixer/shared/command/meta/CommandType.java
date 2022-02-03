package com.weeryan17.mixer.shared.command.meta;

import com.weeryan17.mixer.shared.command.data.CreateChannels;
import com.weeryan17.mixer.shared.command.data.DeleteChannels;
import com.weeryan17.mixer.shared.command.data.IdentifyProperties;
import com.weeryan17.mixer.shared.command.data.Init;
import com.weeryan17.mixer.shared.command.data.Invalid;
import com.weeryan17.mixer.shared.command.data.VersionProperties;

import java.util.Arrays;
import java.util.Locale;

public enum CommandType {

    INIT(Init.class),
    CREATE_CHANNELS(CreateChannels.class),
    DELETE_CHANNELS(DeleteChannels.class),
    IDENTIFY(IdentifyProperties.class),
    VERSION(VersionProperties.class),
    INVALID(Invalid.class);

    private String command;
    private Class<? extends CommandData> javaClass;
    CommandType(String command, Class<? extends CommandData> javaClass) {
        this.command = command;
        this.javaClass = javaClass;
    }

    CommandType(Class<? extends CommandData> javaClass) {
        this.command = this.name().toLowerCase(Locale.ROOT);
        this.javaClass = javaClass;
    }

    public Class<? extends CommandData> getJavaClass() {
        return javaClass;
    }

    public String getCommand() {
        return command;
    }

    public static CommandType getByCommand(String command) {
        return Arrays.stream(CommandType.values()).filter(commandType -> commandType.command.equals(command)).findFirst().orElse(null);
    }

}
