package com.crashlytics.android.core;

import com.crashlytics.android.core.Report.Type;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: SessionReport */
class ar implements Report {
    private final File file;
    private final File[] rs;
    private final Map<String, String> rt;

    public ar(File file) {
        this(file, Collections.emptyMap());
    }

    public ar(File file, Map<String, String> map) {
        this.file = file;
        this.rs = new File[]{file};
        this.rt = new HashMap(map);
        if (this.file.length() == 0) {
            this.rt.putAll(ao.rQ);
        }
    }

    public File fI() {
        return this.file;
    }

    public File[] fJ() {
        return this.rs;
    }

    public String getFileName() {
        return fI().getName();
    }

    public String getIdentifier() {
        String fileName = getFileName();
        return fileName.substring(0, fileName.lastIndexOf(46));
    }

    public Map<String, String> fK() {
        return Collections.unmodifiableMap(this.rt);
    }

    public void remove() {
        k biX = c.biX();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Removing report at ");
        stringBuilder.append(this.file.getPath());
        biX.d("CrashlyticsCore", stringBuilder.toString());
        this.file.delete();
    }

    public Type fL() {
        return Type.JAVA;
    }
}
