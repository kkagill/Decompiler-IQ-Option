package io.fabric.sdk.android.services.c;

import android.content.Context;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.h;
import java.io.File;

/* compiled from: FileStoreImpl */
public class b implements a {
    private final Context context;
    private final String eOU;
    private final String eOV;

    public b(h hVar) {
        if (hVar.getContext() != null) {
            this.context = hVar.getContext();
            this.eOU = hVar.getPath();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Android/");
            stringBuilder.append(this.context.getPackageName());
            this.eOV = stringBuilder.toString();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    public File getFilesDir() {
        return z(this.context.getFilesDir());
    }

    /* Access modifiers changed, original: 0000 */
    public File z(File file) {
        String str = "Fabric";
        if (file == null) {
            c.biX().d(str, "Null File");
        } else if (file.exists() || file.mkdirs()) {
            return file;
        } else {
            c.biX().w(str, "Couldn't create file");
        }
        return null;
    }
}
