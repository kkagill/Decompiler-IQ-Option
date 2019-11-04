package com.iqoption.withdraw.fields.a;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.TextView;
import androidx.transition.TransitionManager;
import com.google.android.material.textfield.TextInputLayout;
import com.iqoption.core.microservices.withdraw.response.h;
import com.iqoption.core.ui.widget.IQTextInputEditText;
import com.iqoption.withdraw.a.o;
import com.iqoption.withdraw.d.g;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010!\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010\fH\u0016J\t\u0010#\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8V@VX\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006$"}, bng = {"Lcom/iqoption/withdraw/fields/holder/AmountFieldHolder;", "Lcom/iqoption/withdraw/fields/holder/PayoutFieldHolder;", "binding", "Lcom/iqoption/withdraw/databinding/ItemPayoutAmountFieldBinding;", "field", "Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "(Lcom/iqoption/withdraw/databinding/ItemPayoutAmountFieldBinding;Lcom/iqoption/core/microservices/withdraw/response/PayoutField;)V", "getBinding", "()Lcom/iqoption/withdraw/databinding/ItemPayoutAmountFieldBinding;", "getField", "()Lcom/iqoption/core/microservices/withdraw/response/PayoutField;", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "component1", "component2", "copy", "editText", "Lcom/iqoption/core/ui/widget/IQTextInputEditText;", "equals", "", "other", "", "hashCode", "", "setError", "", "error", "setHint", "hint", "setPlaceholder", "placeholder", "toString", "withdraw_release"})
/* compiled from: AmountFieldHolder.kt */
public final class a implements b {
    private final o esd;
    private final h ese;

    /* JADX WARNING: Missing block: B:6:0x001e, code skipped:
            if (kotlin.jvm.internal.i.y(bcy(), r3.bcy()) != false) goto L_0x0023;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0023;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.withdraw.fields.a.a;
        if (r0 == 0) goto L_0x0021;
    L_0x0006:
        r3 = (com.iqoption.withdraw.fields.a.a) r3;
        r0 = r2.esd;
        r1 = r3.esd;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0021;
    L_0x0012:
        r0 = r2.bcy();
        r3 = r3.bcy();
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0021;
    L_0x0020:
        goto L_0x0023;
    L_0x0021:
        r3 = 0;
        return r3;
    L_0x0023:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.withdraw.fields.a.a.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        o oVar = this.esd;
        int i = 0;
        int hashCode = (oVar != null ? oVar.hashCode() : 0) * 31;
        h bcy = bcy();
        if (bcy != null) {
            i = bcy.hashCode();
        }
        return hashCode + i;
    }

    public void setPlaceholder(String str) {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AmountFieldHolder(binding=");
        stringBuilder.append(this.esd);
        stringBuilder.append(", field=");
        stringBuilder.append(bcy());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(o oVar, h hVar) {
        kotlin.jvm.internal.i.f(oVar, "binding");
        kotlin.jvm.internal.i.f(hVar, "field");
        this.esd = oVar;
        this.ese = hVar;
    }

    public h bcy() {
        return this.ese;
    }

    public String getValue() {
        IQTextInputEditText iQTextInputEditText = this.esd.equ;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.fieldAmountEdit");
        Editable text = iQTextInputEditText.getText();
        return String.valueOf(text != null ? v.trim(text) : null);
    }

    public void setValue(String str) {
        IQTextInputEditText iQTextInputEditText = this.esd.equ;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.fieldAmountEdit");
        iQTextInputEditText.setText(str);
        Editable text = iQTextInputEditText.getText();
        iQTextInputEditText.setSelection(text != null ? text.length() : 0);
    }

    public void hI(String str) {
        TextInputLayout textInputLayout = this.esd.eqv;
        kotlin.jvm.internal.i.e(textInputLayout, "binding.fieldAmountInput");
        textInputLayout.setHint(str);
    }

    public void kn(String str) {
        int i;
        int i2;
        TransitionManager.beginDelayedTransition(this.esd.eqt);
        View root = this.esd.getRoot();
        kotlin.jvm.internal.i.e(root, "binding.root");
        Context context = root.getContext();
        CharSequence charSequence = str;
        Object obj = (charSequence == null || u.Y(charSequence)) ? 1 : null;
        String str2 = "binding.withdrawAmountError";
        if (obj != null) {
            i = com.iqoption.withdraw.d.a.black;
            i2 = g.TextInputLayoutWithdraw;
            TextView textView = this.esd.eqw;
            kotlin.jvm.internal.i.e(textView, str2);
            com.iqoption.core.ext.a.al(textView);
        } else {
            i2 = com.iqoption.withdraw.d.a.red;
            int i3 = g.TextInputLayoutWithdrawError;
            TextView textView2 = this.esd.eqw;
            kotlin.jvm.internal.i.e(textView2, str2);
            com.iqoption.core.ext.a.ak(textView2);
            textView2 = this.esd.eqw;
            kotlin.jvm.internal.i.e(textView2, str2);
            textView2.setText(charSequence);
            i = i2;
            i2 = i3;
        }
        IQTextInputEditText iQTextInputEditText = this.esd.equ;
        kotlin.jvm.internal.i.e(context, "context");
        iQTextInputEditText.setTextColor(com.iqoption.core.ext.a.k(context, i));
        this.esd.eqv.setHintTextAppearance(i2);
    }

    /* renamed from: arP */
    public IQTextInputEditText aqn() {
        IQTextInputEditText iQTextInputEditText = this.esd.equ;
        kotlin.jvm.internal.i.e(iQTextInputEditText, "binding.fieldAmountEdit");
        return iQTextInputEditText;
    }
}
