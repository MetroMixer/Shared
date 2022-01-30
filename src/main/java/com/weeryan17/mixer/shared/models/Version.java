package com.weeryan17.mixer.shared.models;

import java.util.Objects;

public class Version {

    private String descriptor = null;
    private int major;
    private int minor;
    private int patch;
    private Integer build = null;

    public Version(int major, int minor, int patch) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    public Version(int major, int minor, int patch, int build) {
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.build = build;
    }

    public Version(String descriptor, int major, int minor, int patch) {
        if (!Objects.nonNull(descriptor)) {
            throw new IllegalArgumentException("descriptor can't be null");
        }
        this.descriptor = descriptor;
        this.major = major;
        this.minor = minor;
        this.patch = patch;
    }

    public Version(String descriptor, int major, int minor, int patch, int build) {
        if (!Objects.nonNull(descriptor)) {
            throw new IllegalArgumentException("descriptor can't be null");
        }
        this.descriptor = descriptor;
        this.major = major;
        this.minor = minor;
        this.patch = patch;
        this.build = build;
    }

    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    public int getMajor() {
        return major;
    }

    public void setMajor(int major) {
        this.major = major;
    }

    public int getMinor() {
        return minor;
    }

    public void setMinor(int minor) {
        this.minor = minor;
    }

    public int getPatch() {
        return patch;
    }

    public void setPatch(int patch) {
        this.patch = patch;
    }

    public Integer getBuild() {
        return build;
    }

    public void setBuild(Integer build) {
        this.build = build;
    }

    @Override
    public String toString() {
        return (descriptor != null ? descriptor + "-" : "") + major + "." + minor + "." + patch + (build != null ? "_" + build : "");
    }
}
