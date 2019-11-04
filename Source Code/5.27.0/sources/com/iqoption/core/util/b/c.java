package com.iqoption.core.util.b;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J \u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/util/link/LinkTouchMovementMethod;", "Landroid/text/method/LinkMovementMethod;", "()V", "pressedSpan", "Lcom/iqoption/core/util/link/TouchableSpan;", "getPressedSpan", "textView", "Landroid/widget/TextView;", "spannable", "Landroid/text/Spannable;", "event", "Landroid/view/MotionEvent;", "onTouchEvent", "", "positionWithinTag", "position", "", "tag", "", "core_release"})
/* compiled from: LinkTouchMovementMethod.kt */
public final class c extends LinkMovementMethod {
    private i bRQ;

    public boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        kotlin.jvm.internal.i.f(textView, "textView");
        kotlin.jvm.internal.i.f(spannable, "spannable");
        kotlin.jvm.internal.i.f(motionEvent, "event");
        int action = motionEvent.getAction();
        i iVar;
        if (action == 0) {
            this.bRQ = a(textView, spannable, motionEvent);
            iVar = this.bRQ;
            if (iVar != null) {
                iVar.setPressed(true);
                Selection.setSelection(spannable, spannable.getSpanStart(iVar), spannable.getSpanEnd(iVar));
            }
        } else if (action != 2) {
            i iVar2 = this.bRQ;
            if (iVar2 != null) {
                iVar2.setPressed(false);
                super.onTouchEvent(textView, spannable, motionEvent);
            }
            this.bRQ = (i) null;
            Selection.removeSelection(spannable);
        } else {
            iVar = a(textView, spannable, motionEvent);
            i iVar3 = this.bRQ;
            if (!(iVar3 == null || (kotlin.jvm.internal.i.y(iVar, iVar3) ^ 1) == 0)) {
                iVar3.setPressed(false);
                this.bRQ = (i) null;
                Selection.removeSelection(spannable);
            }
        }
        return true;
    }

    private final i a(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        int x = (((int) motionEvent.getX()) - textView.getTotalPaddingLeft()) + textView.getScrollX();
        int y = (((int) motionEvent.getY()) - textView.getTotalPaddingTop()) + textView.getScrollY();
        Layout layout = textView.getLayout();
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(y), (float) x);
        i[] iVarArr = (i[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, i.class);
        i iVar = (i) null;
        kotlin.jvm.internal.i.e(iVarArr, "link");
        if (((iVarArr.length == 0 ? 1 : 0) ^ 1) == 0) {
            return iVar;
        }
        Object obj = iVarArr[0];
        kotlin.jvm.internal.i.e(obj, "link[0]");
        return a(offsetForHorizontal, spannable, obj) ? iVarArr[0] : iVar;
    }

    private final boolean a(int i, Spannable spannable, Object obj) {
        return i >= spannable.getSpanStart(obj) && i <= spannable.getSpanEnd(obj);
    }
}
