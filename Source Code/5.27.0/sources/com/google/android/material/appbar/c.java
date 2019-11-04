package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.appcompat.R;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, bng = {"Lcom/google/android/material/appbar/ThemeUtils;", "", "()V", "APPCOMPAT_CHECK_ATTRS", "", "checkAppCompatTheme", "", "context", "Landroid/content/Context;", "core_release"})
/* compiled from: ThemeUtils.kt */
public final class c {
    private static final int[] Fy = new int[]{R.attr.colorPrimary};
    public static final c Fz = new c();

    private c() {
    }

    public final void al(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Fy);
        if (obtainStyledAttributes == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        int hasValue = obtainStyledAttributes.hasValue(0) ^ 1;
        obtainStyledAttributes.recycle();
        if (hasValue != 0) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
