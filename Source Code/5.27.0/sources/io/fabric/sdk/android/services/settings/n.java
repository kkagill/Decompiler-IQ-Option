package io.fabric.sdk.android.services.settings;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;
import io.fabric.sdk.android.services.common.CommonUtils;

/* compiled from: IconRequest */
public class n {
    public final int ePE;
    public final String ePf;
    public final int height;
    public final int width;

    public n(String str, int i, int i2, int i3) {
        this.ePf = str;
        this.ePE = i;
        this.width = i2;
        this.height = i3;
    }

    public static n N(Context context, String str) {
        String str2 = "Fabric";
        if (str != null) {
            try {
                int cy = CommonUtils.cy(context);
                k biX = c.biX();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("App icon resource ID is ");
                stringBuilder.append(cy);
                biX.d(str2, stringBuilder.toString());
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), cy, options);
                return new n(str, cy, options.outWidth, options.outHeight);
            } catch (Exception e) {
                c.biX().e(str2, "Failed to load icon", e);
            }
        }
        return null;
    }
}
