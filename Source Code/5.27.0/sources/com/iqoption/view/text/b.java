package com.iqoption.view.text;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.TextView;
import com.google.common.base.Joiner;
import com.google.common.base.d;
import com.google.common.base.k;
import com.google.common.collect.s;
import java.util.Locale;

/* compiled from: CamelSpaceTransformation */
public class b implements TransformationMethod {
    private Locale locale;

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }

    public b(Context context) {
        this.locale = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        int i;
        final Locale ch = ch(view);
        if (charSequence == null) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        if (i == 0) {
            return charSequence;
        }
        return Joiner.e(' ').join(s.a(k.f(' ').k(charSequence), new d<String, String>() {
            /* renamed from: bR */
            public String apply(String str) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str.substring(0, 1).toUpperCase(ch));
                stringBuilder.append(str.length() > 1 ? str.substring(1) : "");
                return stringBuilder.toString();
            }
        }));
    }

    private Locale ch(View view) {
        Locale textLocale = (!(view instanceof TextView) || VERSION.SDK_INT < 17) ? null : ((TextView) view).getTextLocale();
        return textLocale == null ? this.locale : textLocale;
    }
}
