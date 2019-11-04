package com.iqoption.core.ui.widget;

import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.a.p;
import com.iqoption.core.i.h;
import com.iqoption.core.util.ah;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\u0018\u0000  2\u00020\u0001:\u0001 B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010\u001e\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\b\u0010\u001f\u001a\u00020\u0019H\u0002R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, bng = {"Lcom/iqoption/core/ui/widget/PlaceholderedField;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/iqoption/core/databinding/LayoutPlaceholderFieldBinding;", "edit", "Lcom/iqoption/core/ui/widget/IQTextInputEditText;", "getEdit", "()Lcom/iqoption/core/ui/widget/IQTextInputEditText;", "editFocusListener", "Landroid/view/View$OnFocusChangeListener;", "input", "Lcom/google/android/material/textfield/TextInputLayout;", "getInput", "()Lcom/google/android/material/textfield/TextInputLayout;", "placeholder", "", "prevAnimationText", "setEditOnFocusChangeListener", "", "listener", "setHint", "hint", "", "setPlaceholder", "updatePlaceholderVisibility", "Companion", "core_release"})
/* compiled from: PlaceholderedField.kt */
public final class PlaceholderedField extends FrameLayout {
    public static final a bLA = new a();
    private p bLx;
    private String bLy;
    private OnFocusChangeListener bLz;
    private String bou;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, bng = {"<anonymous>", "", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "focused", "", "onFocusChange"})
    /* compiled from: PlaceholderedField.kt */
    /* renamed from: com.iqoption.core.ui.widget.PlaceholderedField$1 */
    static final class AnonymousClass1 implements OnFocusChangeListener {
        final /* synthetic */ PlaceholderedField bLB;

        AnonymousClass1(PlaceholderedField placeholderedField) {
            this.bLB = placeholderedField;
        }

        public final void onFocusChange(View view, boolean z) {
            OnFocusChangeListener b = this.bLB.bLz;
            if (b != null) {
                b.onFocusChange(view, z);
            }
            CharSequence c = this.bLB.bou;
            Object obj = (c == null || u.Y(c)) ? 1 : null;
            if (obj == null) {
                this.bLB.ami();
            }
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, bng = {"Lcom/iqoption/core/ui/widget/PlaceholderedField$Companion;", "", "()V", "PLACEHOLDER_ANIMATION_DURATION", "", "core_release"})
    /* compiled from: PlaceholderedField.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, bng = {"<anonymous>", "", "run"})
    /* compiled from: PlaceholderedField.kt */
    static final class c implements Runnable {
        final /* synthetic */ TextView bLC;

        c(TextView textView) {
            this.bLC = textView;
        }

        public final void run() {
            com.iqoption.core.ext.a.al(this.bLC);
        }
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, bng = {"com/iqoption/core/ui/widget/PlaceholderedField$setPlaceholder$1", "Lcom/iqoption/core/util/TextWatcherAdapter;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "core_release"})
    /* compiled from: PlaceholderedField.kt */
    public static final class b extends ah {
        final /* synthetic */ PlaceholderedField bLB;

        b(PlaceholderedField placeholderedField) {
            this.bLB = placeholderedField;
        }

        public void afterTextChanged(Editable editable) {
            kotlin.jvm.internal.i.f(editable, "s");
            this.bLB.ami();
        }
    }

    public PlaceholderedField(Context context) {
        this(context, null, 0, 6, null);
    }

    public PlaceholderedField(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PlaceholderedField(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = (AttributeSet) null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public PlaceholderedField(Context context, AttributeSet attributeSet, int i) {
        kotlin.jvm.internal.i.f(context, "context");
        super(context, attributeSet, i);
        this.bLx = (p) com.iqoption.core.ext.a.a((ViewGroup) this, h.layout_placeholder_field, (ViewGroup) this, true);
        this.bLx.bfO.setOnFocusChangeListener(new AnonymousClass1(this));
    }

    public final void setPlaceholder(String str) {
        this.bou = str;
        CharSequence charSequence = str;
        Object obj = (charSequence == null || u.Y(charSequence)) ? 1 : null;
        String str2 = "binding.placeholderedFieldPlaceholder";
        if (obj == null) {
            TextView textView = this.bLx.bfQ;
            kotlin.jvm.internal.i.e(textView, str2);
            textView.setText(charSequence);
            this.bLx.bfO.addTextChangedListener(new b(this));
            ami();
            return;
        }
        TextView textView2 = this.bLx.bfQ;
        kotlin.jvm.internal.i.e(textView2, str2);
        com.iqoption.core.ext.a.al(textView2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    private final void ami() {
        /*
        r8 = this;
        r0 = r8.bou;
        r0 = (java.lang.CharSequence) r0;
        r1 = 0;
        r2 = 1;
        if (r0 == 0) goto L_0x0011;
    L_0x0008:
        r0 = kotlin.text.u.Y(r0);
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0011;
    L_0x000f:
        r0 = 0;
        goto L_0x0012;
    L_0x0011:
        r0 = 1;
    L_0x0012:
        r3 = "binding.placeholderedFieldPlaceholder";
        if (r0 == 0) goto L_0x0023;
    L_0x0016:
        r0 = r8.bLx;
        r0 = r0.bfQ;
        kotlin.jvm.internal.i.e(r0, r3);
        r0 = (android.view.View) r0;
        com.iqoption.core.ext.a.al(r0);
        return;
    L_0x0023:
        r0 = r8.bLx;
        r0 = r0.bfO;
        r0 = r0.hasFocus();
        r4 = r8.bLx;
        r4 = r4.bfO;
        r5 = "binding.placeholderedFieldEdit";
        kotlin.jvm.internal.i.e(r4, r5);
        r4 = r4.getText();
        r4 = java.lang.String.valueOf(r4);
        r5 = r8.bLx;
        r5 = r5.bfQ;
        kotlin.jvm.internal.i.e(r5, r3);
        r3 = r4;
        r3 = (java.lang.CharSequence) r3;
        r6 = r3.length();
        if (r6 <= 0) goto L_0x004e;
    L_0x004c:
        r6 = 1;
        goto L_0x004f;
    L_0x004e:
        r6 = 0;
    L_0x004f:
        if (r0 == 0) goto L_0x0055;
    L_0x0051:
        if (r6 != 0) goto L_0x0055;
    L_0x0053:
        r0 = 1;
        goto L_0x0056;
    L_0x0055:
        r0 = 0;
    L_0x0056:
        r6 = r5.getTag();
        r6 = (java.lang.Boolean) r6;
        r7 = java.lang.Boolean.valueOf(r0);
        r6 = kotlin.jvm.internal.i.y(r6, r7);
        if (r6 == 0) goto L_0x0067;
    L_0x0066:
        return;
    L_0x0067:
        r6 = java.lang.Boolean.valueOf(r0);
        r5.setTag(r6);
        r6 = r5.animate();
        r6.cancel();
        r6 = r8.bLy;
        r6 = (java.lang.CharSequence) r6;
        if (r6 == 0) goto L_0x0084;
    L_0x007b:
        r6 = r6.length();
        if (r6 != 0) goto L_0x0082;
    L_0x0081:
        goto L_0x0084;
    L_0x0082:
        r6 = 0;
        goto L_0x0085;
    L_0x0084:
        r6 = 1;
    L_0x0085:
        r7 = 0;
        if (r6 == 0) goto L_0x00a7;
    L_0x0088:
        r3 = r3.length();
        if (r3 != 0) goto L_0x008f;
    L_0x008e:
        r1 = 1;
    L_0x008f:
        if (r1 == 0) goto L_0x00a7;
    L_0x0091:
        r1 = r5.getContext();
        r2 = "holderView.context";
        kotlin.jvm.internal.i.e(r1, r2);
        r1 = r1.getResources();
        r2 = com.iqoption.core.i.d.dp10;
        r1 = r1.getDimension(r2);
        r2 = 100;
        goto L_0x00aa;
    L_0x00a7:
        r2 = 25;
        r1 = 0;
    L_0x00aa:
        if (r0 == 0) goto L_0x00cd;
    L_0x00ac:
        r0 = r5;
        r0 = (android.view.View) r0;
        r6 = com.iqoption.core.ext.a.ag(r0);
        if (r6 == 0) goto L_0x00bb;
    L_0x00b5:
        r5.setAlpha(r7);
        r5.setTranslationY(r1);
    L_0x00bb:
        com.iqoption.core.ext.a.ak(r0);
        r0 = r5.animate();
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = r0.alpha(r1);
        r0 = r0.translationY(r7);
        goto L_0x00e4;
    L_0x00cd:
        r0 = r5.animate();
        r0 = r0.alpha(r7);
        r0 = r0.translationY(r1);
        r1 = new com.iqoption.core.ui.widget.PlaceholderedField$c;
        r1.<init>(r5);
        r1 = (java.lang.Runnable) r1;
        r0 = r0.withEndAction(r1);
    L_0x00e4:
        r1 = "animator";
        kotlin.jvm.internal.i.e(r0, r1);
        r0.setDuration(r2);
        r8.bLy = r4;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.widget.PlaceholderedField.ami():void");
    }

    public final void setHint(CharSequence charSequence) {
        TextInputLayout textInputLayout = this.bLx.bfP;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.placeholderedFieldInput");
        textInputLayout.setHint(charSequence);
    }

    public final TextInputLayout getInput() {
        TextInputLayout textInputLayout = this.bLx.bfP;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.placeholderedFieldInput");
        return textInputLayout;
    }

    public final IQTextInputEditText getEdit() {
        IQTextInputEditText iQTextInputEditText = this.bLx.bfO;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.placeholderedFieldEdit");
        return iQTextInputEditText;
    }

    public final void setEditOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.bLz = onFocusChangeListener;
    }
}
