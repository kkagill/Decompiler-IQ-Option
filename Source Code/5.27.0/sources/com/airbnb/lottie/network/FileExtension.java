package com.airbnb.lottie.network;

import com.airbnb.lottie.d.d;

public enum FileExtension {
    JSON(".json"),
    ZIP(".zip");
    
    public final String extension;

    private FileExtension(String str) {
        this.extension = str;
    }

    public String tempExtension() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".temp");
        stringBuilder.append(this.extension);
        return stringBuilder.toString();
    }

    public String toString() {
        return this.extension;
    }

    public static FileExtension forFile(String str) {
        for (FileExtension fileExtension : values()) {
            if (str.endsWith(fileExtension.extension)) {
                return fileExtension;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unable to find correct extension for ");
        stringBuilder.append(str);
        d.warning(stringBuilder.toString());
        return JSON;
    }
}
