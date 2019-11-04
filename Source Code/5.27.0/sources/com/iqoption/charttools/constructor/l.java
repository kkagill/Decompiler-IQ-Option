package com.iqoption.charttools.constructor;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.charttools.model.indicator.constructor.InputItem;
import com.iqoption.charttools.model.indicator.constructor.InputItem.Type;
import com.iqoption.charttools.n;
import com.iqoption.core.d;
import com.iqoption.core.ext.c;
import com.iqoption.dto.entity.position.Position;
import kotlin.i;
import kotlin.jvm.a.a;

@i(bne = {1, 1, 15}, bnf = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u000eH\u0004J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e@DX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R$\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e8V@VX\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u0010\"\u0004\b\u001e\u0010\u0012¨\u0006$"}, bng = {"Lcom/iqoption/charttools/constructor/InputField;", "Lcom/iqoption/charttools/constructor/LabeledInput;", "id", "", "gid", "input", "Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "default", "", "onChanged", "Lkotlin/Function0;", "", "(IILcom/iqoption/charttools/model/indicator/constructor/InputItem;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "_strValue", "", "get_strValue", "()Ljava/lang/CharSequence;", "set_strValue", "(Ljava/lang/CharSequence;)V", "<set-?>", "error", "getError", "setError", "isDefault", "", "()Z", "isValid", "value", "strValue", "getStrValue", "setStrValue", "numValue", "", "toDefault", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "toInput", "techtools_release"})
/* compiled from: InputAdapterItems.kt */
public class l extends z {
    private CharSequence QF;
    private CharSequence aFt;

    /* Access modifiers changed, original: protected */
    public CharSequence a(CharSequence charSequence, double d) {
        kotlin.jvm.internal.i.f(charSequence, ConditionalUserProperty.VALUE);
        return null;
    }

    public l(int i, int i2, InputItem inputItem, String str, a<kotlin.l> aVar) {
        kotlin.jvm.internal.i.f(inputItem, "input");
        kotlin.jvm.internal.i.f(str, Position.CLOSE_REASON_DEFAULT);
        super(i, i2, inputItem, str, aVar, null);
        this.aFt = inputItem.getValue();
    }

    /* Access modifiers changed, original: protected|final */
    public final CharSequence Ne() {
        return this.aFt;
    }

    /* Access modifiers changed, original: protected|final */
    public final void r(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, "<set-?>");
        this.aFt = charSequence;
    }

    public CharSequence Nf() {
        return this.aFt;
    }

    public void s(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, ConditionalUserProperty.VALUE);
        if ((kotlin.jvm.internal.i.y(this.aFt, charSequence) ^ 1) != 0) {
            this.aFt = charSequence;
            this.QF = t(charSequence);
            onChanged();
        }
    }

    public final CharSequence getError() {
        return this.QF;
    }

    /* Access modifiers changed, original: protected|final */
    public final void setError(CharSequence charSequence) {
        this.QF = charSequence;
    }

    public boolean isValid() {
        return this.QF == null;
    }

    public boolean isDefault() {
        return kotlin.jvm.internal.i.y(Nt(), this.aFt.toString());
    }

    public InputItem Na() {
        return InputItem.a(Ns(), null, null, this.aFt.toString(), null, null, null, null, false, 251, null);
    }

    public f Nb() {
        return new l(getId().intValue(), getGid(), Nr(), Nt(), Nu());
    }

    /* Access modifiers changed, original: protected|final */
    public final CharSequence t(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, ConditionalUserProperty.VALUE);
        Type OK = Ns().OK();
        Object obj = (OK == Type.INT || OK == Type.DOUBLE) ? null : 1;
        if (obj != null) {
            return null;
        }
        if ((charSequence.length() == 0 ? 1 : null) != null) {
            return d.getString(n.i.value_is_empty);
        }
        double C = c.C(charSequence);
        Double OL = Ns().OL();
        if (OL == null || C >= OL.doubleValue()) {
            OL = Ns().OM();
            if (OL == null || C <= OL.doubleValue()) {
                return a(charSequence, C);
            }
            return d.getString(n.i.max_n1, Ns().OJ());
        }
        return d.getString(n.i.min_n1, Ns().OI());
    }
}
