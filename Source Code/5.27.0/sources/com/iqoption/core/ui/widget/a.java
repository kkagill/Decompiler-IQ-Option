package com.iqoption.core.ui.widget;

import android.text.InputFilter;
import android.text.Spanned;
import java.math.BigDecimal;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J:\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, bng = {"Lcom/iqoption/core/ui/widget/ExtendedBigDecimalPrecisionFilter;", "Landroid/text/InputFilter;", "precision", "", "(I)V", "filter", "", "source", "start", "end", "dest", "Landroid/text/Spanned;", "dstart", "dend", "setPrecision", "", "core_release"})
/* compiled from: ExtendedBigDecimalPrecisionFilter.kt */
public final class a implements InputFilter {
    private int akR;

    public a(int i) {
        this.akR = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String str = "";
        kotlin.jvm.internal.i.f(charSequence, "source");
        kotlin.jvm.internal.i.f(spanned, "dest");
        String obj = charSequence.subSequence(i, i2).toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(spanned.subSequence(0, i3).toString());
        stringBuilder.append(obj);
        stringBuilder.append(spanned.subSequence(i4, spanned.length()).toString());
        obj = stringBuilder.toString();
        try {
            if (kotlin.jvm.internal.i.y(obj, "00")) {
                return ".0";
            }
            if (kotlin.jvm.internal.i.y(obj, ".")) {
                return "0.";
            }
            if (new BigDecimal(obj).scale() <= this.akR) {
                charSequence = null;
            } else {
                charSequence = str;
            }
            return charSequence;
        } catch (NullPointerException | NumberFormatException unused) {
            return str;
        }
    }
}
