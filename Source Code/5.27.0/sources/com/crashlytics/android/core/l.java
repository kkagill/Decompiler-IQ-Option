package com.crashlytics.android.core;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.c.a;
import java.io.File;
import java.io.IOException;

/* compiled from: CrashlyticsFileMarker */
class l {
    private final a oa;
    private final String ra;

    public l(String str, a aVar) {
        this.ra = str;
        this.oa = aVar;
    }

    public boolean fs() {
        try {
            return fu().createNewFile();
        } catch (IOException e) {
            k biX = c.biX();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error creating marker: ");
            stringBuilder.append(this.ra);
            biX.e("CrashlyticsCore", stringBuilder.toString(), e);
            return false;
        }
    }

    public boolean isPresent() {
        return fu().exists();
    }

    public boolean ft() {
        return fu().delete();
    }

    private File fu() {
        return new File(this.oa.getFilesDir(), this.ra);
    }
}
