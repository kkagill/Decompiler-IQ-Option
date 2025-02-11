package com.iqoption.core.ui.b;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, bng = {"Lcom/iqoption/core/ui/constraint/ConstraintSetTextViewExt;", "Landroidx/constraintlayout/widget/ConstraintSet;", "()V", "constraints", "", "", "Lcom/iqoption/core/ui/constraint/ConstraintSetTextViewExt$TextViewConstraint;", "applyTo", "", "constraintLayout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "clone", "TextViewConstraint", "core_release"})
/* compiled from: ConstraintSetTextViewExt.kt */
public final class a extends ConstraintSet {
    private final Map<Integer, a> bHU = new LinkedHashMap();

    @i(bne = {1, 1, 15}, bnf = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0013"}, bng = {"Lcom/iqoption/core/ui/constraint/ConstraintSetTextViewExt$TextViewConstraint;", "", "viewId", "", "textSize", "", "(IF)V", "getTextSize", "()F", "setTextSize", "(F)V", "getViewId", "()I", "setViewId", "(I)V", "fillFrom", "", "textView", "Landroid/widget/TextView;", "core_release"})
    /* compiled from: ConstraintSetTextViewExt.kt */
    private static final class a {
        private float bHV;
        private int viewId;

        public a() {
            this(0, 0.0f, 3, null);
        }

        public a(int i, float f) {
            this.viewId = i;
            this.bHV = f;
        }

        public /* synthetic */ a(int i, float f, int i2, f fVar) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                f = 0.0f;
            }
            this(i, f);
        }

        public final float getTextSize() {
            return this.bHV;
        }

        public final void l(TextView textView) {
            kotlin.jvm.internal.i.f(textView, "textView");
            this.viewId = textView.getId();
            this.bHV = textView.getTextSize();
        }
    }

    public void clone(ConstraintLayout constraintLayout) {
        kotlin.jvm.internal.i.f(constraintLayout, "constraintLayout");
        super.clone(constraintLayout);
        int childCount = constraintLayout.getChildCount();
        this.bHU.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (!(childAt instanceof TextView)) {
                childAt = null;
            }
            TextView textView = (TextView) childAt;
            if (textView != null) {
                int id = textView.getId();
                if (id != -1) {
                    if (!this.bHU.containsKey(Integer.valueOf(id))) {
                        this.bHU.put(Integer.valueOf(id), new a(0, 0.0f, 3, null));
                    }
                    Object obj = this.bHU.get(Integer.valueOf(id));
                    if (obj == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    ((a) obj).l(textView);
                } else {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        kotlin.jvm.internal.i.f(constraintLayout, "constraintLayout");
        super.applyTo(constraintLayout);
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (!(childAt instanceof TextView)) {
                childAt = null;
            }
            TextView textView = (TextView) childAt;
            if (textView != null) {
                int id = textView.getId();
                if (id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                } else if (this.bHU.containsKey(Integer.valueOf(id))) {
                    Object obj = this.bHU.get(Integer.valueOf(id));
                    if (obj == null) {
                        kotlin.jvm.internal.i.bnJ();
                    }
                    textView.setTextSize(0, ((a) obj).getTextSize());
                }
            }
        }
    }
}
