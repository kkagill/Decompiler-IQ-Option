package com.iqoption.core.ui.widget.gl;

import java.util.ArrayList;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fJ\u0016\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\fR\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0010R$\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0010R$\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\u0010R\u000e\u0010\u001a\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, bng = {"Lcom/iqoption/core/ui/widget/gl/ChartFrame;", "", "()V", "<set-?>", "", "graphHeight", "getGraphHeight", "()I", "graphWidth", "getGraphWidth", "listeners", "", "Lcom/iqoption/core/ui/widget/gl/ChartFrame$OnFrameSizeChangedListener;", "paddingBottom", "getPaddingBottom", "setPaddingBottom", "(I)V", "paddingLeft", "getPaddingLeft", "setPaddingLeft", "paddingRight", "getPaddingRight", "setPaddingRight", "paddingTop", "getPaddingTop", "setPaddingTop", "viewHeight", "viewWidth", "addSizeChangedListener", "", "l", "onSizeChanged", "newWidth", "newHeight", "removeSizeChangedListener", "OnFrameSizeChangedListener", "core_release"})
/* compiled from: ChartFrame.kt */
public final class a {
    private int bNF;
    private int bNG;
    private final List<a> gb = new ArrayList();
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;
    private int viewHeight;
    private int viewWidth;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H&¨\u0006\u000b"}, bng = {"Lcom/iqoption/core/ui/widget/gl/ChartFrame$OnFrameSizeChangedListener;", "", "onFrameSizeChanged", "", "paddingLeft", "", "paddingTop", "paddingRight", "paddingBottom", "width", "height", "core_release"})
    /* compiled from: ChartFrame.kt */
    public interface a {
        void b(int i, int i2, int i3, int i4, int i5, int i6);
    }

    public final int amM() {
        return this.bNF;
    }

    public final int amN() {
        return this.bNG;
    }

    public final int getPaddingLeft() {
        return this.paddingLeft;
    }

    public final void setPaddingLeft(int i) {
        this.paddingLeft = i;
        ar(this.viewWidth, this.viewHeight);
    }

    public final int getPaddingTop() {
        return this.paddingTop;
    }

    public final void setPaddingTop(int i) {
        this.paddingTop = i;
        ar(this.viewWidth, this.viewHeight);
    }

    public final int getPaddingRight() {
        return this.paddingRight;
    }

    public final void setPaddingRight(int i) {
        this.paddingRight = i;
        ar(this.viewWidth, this.viewHeight);
    }

    public final int getPaddingBottom() {
        return this.paddingBottom;
    }

    public final void setPaddingBottom(int i) {
        this.paddingBottom = i;
        ar(this.viewWidth, this.viewHeight);
    }

    public final void ar(int i, int i2) {
        this.viewWidth = i;
        this.viewHeight = i2;
        this.bNF = (i - this.paddingLeft) - this.paddingRight;
        this.bNG = (i2 - this.paddingTop) - this.paddingBottom;
        for (a b : this.gb) {
            b.b(this.paddingLeft, this.paddingTop, this.paddingRight, this.paddingBottom, this.bNF, this.bNG);
        }
    }

    public final void a(a aVar) {
        kotlin.jvm.internal.i.f(aVar, "l");
        this.gb.add(aVar);
    }
}
