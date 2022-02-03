package com.weeryan17.mixer.shared.models;

import java.util.Objects;

public class Version {

    private String descriptor = null;
    private int major;
    private int minor;
    private int patch;
    private Integer build = null;

    private Version() {
    }

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

    public static Version fromString(String versionStr) {
        Version version = new Version();
        String[] descriptorSplit = versionStr.split("-");
        if (descriptorSplit.length > 1) {
            versionStr = descriptorSplit[1];
            version.setDescriptor(descriptorSplit[0]);
        }
        String[] buildSplit = versionStr.split("_");
        if (buildSplit.length > 1) {
            versionStr = buildSplit[0];
            version.setBuild(Integer.parseInt(buildSplit[1]));
        }
        String[] versionNums = versionStr.split("\\.");
        version.setMajor(Integer.parseInt(versionNums[0]));
        version.setMinor(Integer.parseInt(versionNums[1]));
        version.setPatch(Integer.parseInt(versionNums[2]));

        return version;
    }
}
