package com.iqoption.core.util.b;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

@kotlin.i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/core/util/link/TouchableSpan;", "Landroid/text/style/ClickableSpan;", "normalTextColor", "", "pressedTextColor", "(II)V", "isPressed", "", "setPressed", "", "updateDrawState", "ds", "Landroid/text/TextPaint;", "core_release"})
/* compiled from: TouchableSpan.kt */
public abstract class i extends ClickableSpan {
    private boolean bPc;
    private final int bSa;
    private final int bSb;

    public i(int i, int i2) {
        this.bSa = i;
        this.bSb = i2;
    }

    public final void setPressed(boolean z) {
        this.bPc = z;
    }

    public void updateDrawState(TextPaint textPaint) {
        kotlin.jvm.internal.i.f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setColor(this.bPc ? this.bSb : this.bSa);
        textPaint.setUnderlineText(false);
    }
}
