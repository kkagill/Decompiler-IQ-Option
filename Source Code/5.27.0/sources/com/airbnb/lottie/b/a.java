package com.airbnb.lottie.b;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable.Callback;
import android.view.View;
import androidx.annotation.Nullable;
import com.airbnb.lottie.b;
import com.airbnb.lottie.d.d;
import com.airbnb.lottie.model.h;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FontAssetManager */
public class a {
    private final AssetManager assetManager;
    private final h<String> gT = new h();
    private final Map<h<String>, Typeface> gU = new HashMap();
    private final Map<String, Typeface> gV = new HashMap();
    @Nullable
    private b gW;
    private String gX = ".ttf";

    public a(Callback callback, @Nullable b bVar) {
        this.gW = bVar;
        if (callback instanceof View) {
            this.assetManager = ((View) callback).getContext().getAssets();
            return;
        }
        d.warning("LottieDrawable must be inside of a view for images to work.");
        this.assetManager = null;
    }

    public void a(@Nullable b bVar) {
        this.gW = bVar;
    }

    public Typeface g(String str, String str2) {
        this.gT.set(str, str2);
        Typeface typeface = (Typeface) this.gU.get(this.gT);
        if (typeface != null) {
            return typeface;
        }
        Typeface a = a(t(str), str2);
        this.gU.put(this.gT, a);
        return a;
    }

    private Typeface t(String str) {
        Typeface typeface = (Typeface) this.gV.get(str);
        if (typeface != null) {
            return typeface;
        }
        Object obj = null;
        b bVar = this.gW;
        if (bVar != null) {
            obj = bVar.h(str);
        }
        bVar = this.gW;
        if (bVar != null && r0 == null) {
            String j = bVar.j(str);
            if (j != null) {
                obj = Typeface.createFromAsset(this.assetManager, j);
            }
        }
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("fonts/");
            stringBuilder.append(str);
            stringBuilder.append(this.gX);
            obj = Typeface.createFromAsset(this.assetManager, stringBuilder.toString());
        }
        this.gV.put(str, obj);
        return obj;
    }

    private Typeface a(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        if (typeface.getStyle() == i) {
            return typeface;
        }
        return Typeface.create(typeface, i);
    }
}
