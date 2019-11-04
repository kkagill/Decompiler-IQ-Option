package com.airbnb.lottie.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.c;
import com.airbnb.lottie.d.d;
import com.airbnb.lottie.h;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageAssetManager */
public class b {
    private static final Object gY = new Object();
    private final Context context;
    private String gZ;
    @Nullable
    private c ha;
    private final Map<String, h> hb;

    public b(Callback callback, String str, c cVar, Map<String, h> map) {
        this.gZ = str;
        if (!TextUtils.isEmpty(str)) {
            str = this.gZ;
            if (str.charAt(str.length() - 1) != '/') {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.gZ);
                stringBuilder.append('/');
                this.gZ = stringBuilder.toString();
            }
        }
        if (callback instanceof View) {
            this.context = ((View) callback).getContext();
            this.hb = map;
            a(cVar);
            return;
        }
        d.warning("LottieDrawable must be inside of a view for images to work.");
        this.hb = new HashMap();
        this.context = null;
    }

    public void a(@Nullable c cVar) {
        this.ha = cVar;
    }

    @Nullable
    public Bitmap u(String str) {
        h hVar = (h) this.hb.get(str);
        if (hVar == null) {
            return null;
        }
        Bitmap bitmap = hVar.getBitmap();
        if (bitmap != null) {
            return bitmap;
        }
        c cVar = this.ha;
        if (cVar != null) {
            Bitmap a = cVar.a(hVar);
            if (a != null) {
                a(str, a);
            }
            return a;
        }
        String fileName = hVar.getFileName();
        Options options = new Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!fileName.startsWith("data:") || fileName.indexOf("base64,") <= 0) {
            try {
                if (TextUtils.isEmpty(this.gZ)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
                AssetManager assets = this.context.getAssets();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.gZ);
                stringBuilder.append(fileName);
                return a(str, com.airbnb.lottie.d.h.a(BitmapFactory.decodeStream(assets.open(stringBuilder.toString()), null, options), hVar.getWidth(), hVar.getHeight()));
            } catch (IOException e) {
                d.a("Unable to open asset.", e);
                return null;
            }
        }
        try {
            byte[] decode = Base64.decode(fileName.substring(fileName.indexOf(44) + 1), 0);
            return a(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
        } catch (IllegalArgumentException e2) {
            d.a("data URL did not have correct base64 format.", e2);
            return null;
        }
    }

    public boolean e(Context context) {
        return (context == null && this.context == null) || this.context.equals(context);
    }

    private Bitmap a(String str, @Nullable Bitmap bitmap) {
        synchronized (gY) {
            ((h) this.hb.get(str)).setBitmap(bitmap);
        }
        return bitmap;
    }
}
