package com.iqoption.core;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import kotlin.d;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\fH\u0016J)\u0010\u0017\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u001a\"\u00020\u001bH\u0016¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\nH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\n0\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, bng = {"Lcom/iqoption/core/ResourcerImpl;", "Lcom/iqoption/core/Resourcer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "resources", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "viewConfiguration", "Lkotlin/Lazy;", "Landroid/view/ViewConfiguration;", "getColor", "", "resId", "getColors", "Landroid/content/res/ColorStateList;", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getFont", "Landroid/graphics/Typeface;", "getPixels", "", "getPixelsInt", "getString", "", "args", "", "", "(I[Ljava/lang/Object;)Ljava/lang/CharSequence;", "getViewConfiguration", "toPixels", "dp", "core_release"})
/* compiled from: Resourcer.kt */
public final class k implements j {
    private final Resources aOg = this.context.getResources();
    private final d<ViewConfiguration> aZH = g.c(new ResourcerImpl$viewConfiguration$1(this));
    private final Context context;

    public k(Context context) {
        kotlin.jvm.internal.i.f(context, "context");
        this.context = context;
    }

    public CharSequence eA(int i) {
        String string = this.context.getString(i);
        kotlin.jvm.internal.i.e(string, "context.getString(resId)");
        return string;
    }

    public int getColor(int i) {
        return ContextCompat.getColor(this.context, i);
    }

    public ColorStateList ex(int i) {
        ColorStateList colorStateList = ContextCompat.getColorStateList(this.context, i);
        if (colorStateList == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return colorStateList;
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = ContextCompat.getDrawable(this.context, i);
        if (drawable == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return drawable;
    }

    public float ey(int i) {
        return this.aOg.getDimension(i);
    }

    public int ez(int i) {
        return this.aOg.getDimensionPixelSize(i);
    }

    public Typeface getFont(int i) {
        Typeface font = ResourcesCompat.getFont(this.context, i);
        if (font == null) {
            kotlin.jvm.internal.i.bnJ();
        }
        return font;
    }
}
