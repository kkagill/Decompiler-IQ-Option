package com.a.b;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.threeten.bp.zone.a;
import org.threeten.bp.zone.c;

/* compiled from: AssetsZoneRulesInitializer */
final class b extends org.threeten.bp.zone.b {
    private final Context context;
    private final String etW;

    b(Context context, String str) {
        this.context = context;
        this.etW = str;
    }

    /* Access modifiers changed, original: protected */
    public void bdk() {
        InputStream inputStream = null;
        try {
            inputStream = this.context.getAssets().open(this.etW);
            a aVar = new a(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            c.a(aVar);
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.etW);
            stringBuilder.append(" missing from assets");
            throw new IllegalStateException(stringBuilder.toString(), e);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
    }
}
