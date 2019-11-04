package com.iqoption.core.util.b;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.iqoption.core.i.c;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001BS\b\u0007\u0012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0003\u0010\t\u001a\u00020\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u001b\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, bng = {"Lcom/iqoption/core/util/link/LinkifyParams;", "", "links", "", "Lcom/iqoption/core/util/link/Link;", "textView", "Landroid/widget/TextView;", "text", "", "linkNormalResId", "", "linkPressedResId", "underlineLink", "", "listener", "Lcom/iqoption/core/util/link/LinkClickListener;", "([Lcom/iqoption/core/util/link/Link;Landroid/widget/TextView;Ljava/lang/CharSequence;IIZLcom/iqoption/core/util/link/LinkClickListener;)V", "getLinkNormalResId", "()I", "getLinkPressedResId", "getLinks", "()[Lcom/iqoption/core/util/link/Link;", "[Lcom/iqoption/core/util/link/Link;", "getListener", "()Lcom/iqoption/core/util/link/LinkClickListener;", "getText", "()Ljava/lang/CharSequence;", "getTextView", "()Landroid/widget/TextView;", "getUnderlineLink", "()Z", "core_release"})
/* compiled from: LinkUtils.kt */
public final class e {
    private final TextView OQ;
    private final a[] bRV;
    private final int bRW;
    private final int bRX;
    private final boolean bRY;
    private final b bRZ;
    private final CharSequence text;

    public e(a[] aVarArr, TextView textView, CharSequence charSequence) {
        this(aVarArr, textView, charSequence, 0, 0, false, null, 120, null);
    }

    public e(a[] aVarArr, TextView textView, CharSequence charSequence, @ColorRes int i, @ColorRes int i2, boolean z, b bVar) {
        kotlin.jvm.internal.i.f(aVarArr, "links");
        kotlin.jvm.internal.i.f(textView, "textView");
        kotlin.jvm.internal.i.f(charSequence, "text");
        kotlin.jvm.internal.i.f(bVar, CastExtraArgs.LISTENER);
        this.bRV = aVarArr;
        this.OQ = textView;
        this.text = charSequence;
        this.bRW = i;
        this.bRX = i2;
        this.bRY = z;
        this.bRZ = bVar;
    }

    public final a[] anR() {
        return this.bRV;
    }

    public final TextView anS() {
        return this.OQ;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public /* synthetic */ e(a[] aVarArr, TextView textView, CharSequence charSequence, int i, int i2, boolean z, b bVar, int i3, f fVar) {
        b gVar;
        int i4 = (i3 & 8) != 0 ? c.white : i;
        int i5 = (i3 & 16) != 0 ? c.white_60 : i2;
        boolean z2 = (i3 & 32) != 0 ? false : z;
        if ((i3 & 64) != 0) {
            Context context = textView.getContext();
            kotlin.jvm.internal.i.e(context, "textView.context");
            gVar = new g(context);
        } else {
            gVar = bVar;
        }
        this(aVarArr, textView, charSequence, i4, i5, z2, gVar);
    }

    public final int anT() {
        return this.bRW;
    }

    public final int anU() {
        return this.bRX;
    }

    public final boolean anV() {
        return this.bRY;
    }

    public final b anW() {
        return this.bRZ;
    }
}
