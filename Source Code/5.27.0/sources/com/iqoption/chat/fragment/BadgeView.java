package com.iqoption.chat.fragment;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.iqoption.chat.e.b;
import com.iqoption.core.j;
import com.iqoption.core.k;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0018\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0014R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, bng = {"Lcom/iqoption/chat/fragment/BadgeView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "", "date", "getDate", "()J", "setDate", "(J)V", "drawable", "Lcom/iqoption/chat/fragment/DateDrawable;", "init", "", "resourcer", "Lcom/iqoption/core/Resourcer;", "dateComparator", "Lcom/iqoption/chat/util/DateComparator;", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "chat_release"})
/* compiled from: BadgeView.kt */
public final class BadgeView extends View {
    private f aSs;

    public BadgeView(Context context) {
        this(context, null, 0, 6, null);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ BadgeView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = (AttributeSet) null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        kotlin.jvm.internal.i.f(context, "context");
        super(context, attributeSet, i);
        if (isInEditMode()) {
            a(new k(context), new b());
            f fVar = this.aSs;
            if (fVar != null) {
                fVar.setDate(0);
            }
        }
    }

    public final long getDate() {
        f fVar = this.aSs;
        return fVar != null ? fVar.getDate() : -1;
    }

    public final void setDate(long j) {
        f fVar = this.aSs;
        if (fVar != null && fVar.getDate() != j) {
            fVar.setDate(j);
            requestLayout();
        }
    }

    public final void a(j jVar, b bVar) {
        kotlin.jvm.internal.i.f(jVar, "resourcer");
        kotlin.jvm.internal.i.f(bVar, "dateComparator");
        this.aSs = new f(jVar, bVar);
    }

    /* Access modifiers changed, original: protected */
    public void onMeasure(int i, int i2) {
        f fVar = this.aSs;
        i2 = 0;
        i = fVar != null ? fVar.getIntrinsicWidth() : 0;
        f fVar2 = this.aSs;
        if (fVar2 != null) {
            i2 = fVar2.getIntrinsicHeight();
        }
        setMeasuredDimension(i, i2);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        f fVar = this.aSs;
        if (fVar != null) {
            fVar.draw(canvas);
        }
    }
}
