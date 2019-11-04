package com.crashlytics.android.core;

import com.crashlytics.android.core.Report.Type;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import java.io.File;
import java.util.Map;

/* compiled from: NativeSessionReport */
class ah implements Report {
    private final File rD;

    public File fI() {
        return null;
    }

    public Map<String, String> fK() {
        return null;
    }

    public String getFileName() {
        return null;
    }

    public ah(File file) {
        this.rD = file;
    }

    public void remove() {
        File[] fJ = fJ();
        int length = fJ.length;
        int i = 0;
        while (true) {
            String str = "CrashlyticsCore";
            if (i < length) {
                File file = fJ[i];
                k biX = c.biX();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Removing native report file at ");
                stringBuilder.append(file.getPath());
                biX.d(str, stringBuilder.toString());
                file.delete();
                i++;
            } else {
                k biX2 = c.biX();
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("Removing native report directory at ");
                stringBuilder2.append(this.rD);
                biX2.d(str, stringBuilder2.toString());
                this.rD.delete();
                return;
            }
        }
    }

    public String getIdentifier() {
        return this.rD.getName();
    }

    public File[] fJ() {
        return this.rD.listFiles();
    }

    public Type fL() {
        return Type.NATIVE;
    }
}
