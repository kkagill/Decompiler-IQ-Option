package com.crashlytics.android.core;

import com.crashlytics.android.core.Report.Type;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: InvalidSessionReport */
class z implements Report {
    private final String identifier;
    private final File[] rs;
    private final Map<String, String> rt = new HashMap(ao.rQ);

    public z(String str, File[] fileArr) {
        this.rs = fileArr;
        this.identifier = str;
    }

    public String getFileName() {
        return this.rs[0].getName();
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public File fI() {
        return this.rs[0];
    }

    public File[] fJ() {
        return this.rs;
    }

    public Map<String, String> fK() {
        return Collections.unmodifiableMap(this.rt);
    }

    public void remove() {
        for (File file : this.rs) {
            k biX = c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Removing invalid report file at ");
            stringBuilder.append(file.getPath());
            biX.d("CrashlyticsCore", stringBuilder.toString());
            file.delete();
        }
    }

    public Type fL() {
        return Type.JAVA;
    }
}
