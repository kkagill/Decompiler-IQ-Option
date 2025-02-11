package io.fabric.sdk.android.services.c;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import io.fabric.sdk.android.h;

/* compiled from: PreferenceStoreImpl */
public class d implements c {
    private final Context context;
    private final String eOW;
    private final SharedPreferences sA;

    public d(Context context, String str) {
        if (context != null) {
            this.context = context;
            this.eOW = str;
            this.sA = this.context.getSharedPreferences(this.eOW, 0);
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    @Deprecated
    public d(h hVar) {
        this(hVar.getContext(), hVar.getClass().getName());
    }

    public SharedPreferences bkA() {
        return this.sA;
    }

    public Editor edit() {
        return this.sA.edit();
    }

    @TargetApi(9)
    public boolean a(Editor editor) {
        if (VERSION.SDK_INT < 9) {
            return editor.commit();
        }
        editor.apply();
        return true;
    }
}
