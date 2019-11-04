package com.iqoption.asset.a;

import android.content.Context;
import androidx.annotation.ColorInt;
import com.iqoption.core.i.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u0011"}, bng = {"Lcom/iqoption/asset/caser/DiffColorUtils;", "", "()V", "NEGATIVE_COLOR", "", "getNEGATIVE_COLOR", "()I", "POSITIVE_COLOR", "getPOSITIVE_COLOR", "ZERO_COLOR", "getZERO_COLOR", "getDiffColor", "context", "Landroid/content/Context;", "value", "", "(Landroid/content/Context;Ljava/lang/Double;)I", "asset_release"})
/* compiled from: DiffColorUtils.kt */
public final class a {
    private static final int awV = c.green;
    private static final int awW = c.red;
    private static final int awX = c.white;
    public static final a awY = new a();

    private a() {
    }

    public final int JO() {
        return awX;
    }

    @ColorInt
    public final int a(Context context, Double d) {
        int i;
        kotlin.jvm.internal.i.f(context, "context");
        if (d == null) {
            i = awX;
        } else if (d.doubleValue() > 0.001d) {
            i = awV;
        } else if (d.doubleValue() < -0.001d) {
            i = awW;
        } else {
            i = awX;
        }
        return com.iqoption.core.ext.a.k(context, i);
    }
}
