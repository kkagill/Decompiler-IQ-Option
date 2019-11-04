package com.airbnb.lottie.a;

import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.os.LocaleList;
import androidx.annotation.NonNull;

/* compiled from: LPaint */
public class a extends Paint {
    public void setTextLocales(@NonNull LocaleList localeList) {
    }

    public a(int i) {
        super(i);
    }

    public a(Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(int i, Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
