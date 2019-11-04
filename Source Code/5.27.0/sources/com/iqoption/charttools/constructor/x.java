package com.iqoption.charttools.constructor;

import com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty;
import com.iqoption.charttools.model.indicator.constructor.InputItem;
import com.iqoption.core.ext.c;
import com.iqoption.dto.entity.position.Position;
import java.math.BigDecimal;
import java.math.MathContext;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\u0006\u0010\u001e\u001a\u00020\u000bJ\u0006\u0010\u001f\u001a\u00020\u000bJ\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u000bH\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00188V@VX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006#"}, bng = {"Lcom/iqoption/charttools/constructor/InputStepField;", "Lcom/iqoption/charttools/constructor/InputField;", "id", "", "gid", "input", "Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "default", "", "onChanged", "Lkotlin/Function0;", "", "(IILcom/iqoption/charttools/model/indicator/constructor/InputItem;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "doubleDefaultValue", "", "doubleStep", "Ljava/math/BigDecimal;", "doubleValue", "intDefaultValue", "intValue", "isDefault", "", "()Z", "value", "", "strValue", "getStrValue", "()Ljava/lang/CharSequence;", "setStrValue", "(Ljava/lang/CharSequence;)V", "minusStep", "plusStep", "toDefault", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "updateNumValue", "techtools_release"})
/* compiled from: InputAdapterItems.kt */
public final class x extends l {
    private final int aFT;
    private final Object aFU;
    private BigDecimal aFV;
    private final BigDecimal aFW;
    private int intValue;

    public x(int i, int i2, InputItem inputItem, String str, a<l> aVar) {
        BigDecimal bigDecimal;
        kotlin.jvm.internal.i.f(inputItem, "input");
        kotlin.jvm.internal.i.f(str, Position.CLOSE_REASON_DEFAULT);
        super(i, i2, inputItem, str, aVar);
        Integer mW = t.mW(str);
        this.aFT = mW != null ? mW.intValue() : 0;
        Object mV = s.mV(str);
        if (mV == null) {
            mV = Integer.valueOf(0);
        }
        this.aFU = mV;
        this.intValue = inputItem.getIntValue();
        this.aFV = new BigDecimal(inputItem.getValue(), MathContext.DECIMAL32);
        Double ON = inputItem.ON();
        if (ON != null) {
            bigDecimal = new BigDecimal(String.valueOf(ON.doubleValue()));
        } else {
            bigDecimal = BigDecimal.ZERO;
            kotlin.jvm.internal.i.e(bigDecimal, "BigDecimal.ZERO");
        }
        this.aFW = bigDecimal;
    }

    public CharSequence Nf() {
        return Ne();
    }

    public void s(CharSequence charSequence) {
        kotlin.jvm.internal.i.f(charSequence, ConditionalUserProperty.VALUE);
        int i = 1;
        if ((kotlin.jvm.internal.i.y(Ne(), charSequence) ^ 1) != 0) {
            r(charSequence);
            setError(t(charSequence));
            if (charSequence.length() <= 0) {
                i = 0;
            }
            if (i != 0) {
                No();
            }
            onChanged();
        }
    }

    public boolean isDefault() {
        int i = y.aob[Ns().OK().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            return kotlin.jvm.internal.i.y(this.aFU, this.aFV);
        } else if (this.aFT == this.intValue) {
            return true;
        } else {
            return false;
        }
    }

    public f Nb() {
        return new x(getId().intValue(), getGid(), Nr(), Nt(), Nu());
    }

    private final void No() {
        int i = y.axg[Ns().OK().ordinal()];
        if (i == 1) {
            this.intValue = c.B(Ne());
        } else if (i == 2) {
            this.aFV = c.a(Ne(), null, 1, null);
        }
    }

    public final void Np() {
        int i = y.aFX[Ns().OK().ordinal()];
        if (i == 1) {
            i = this.intValue;
            Double ON = Ns().ON();
            this.intValue = i + (ON != null ? (int) ON.doubleValue() : 0);
            s(String.valueOf(this.intValue));
        } else if (i == 2) {
            BigDecimal stripTrailingZeros = this.aFV.add(this.aFW).stripTrailingZeros();
            kotlin.jvm.internal.i.e(stripTrailingZeros, "doubleValue.add(doubleStep).stripTrailingZeros()");
            this.aFV = stripTrailingZeros;
            String toPlainString = this.aFV.toPlainString();
            kotlin.jvm.internal.i.e(toPlainString, "doubleValue.toPlainString()");
            s(toPlainString);
        }
    }

    public final void Nq() {
        int i = y.aFY[Ns().OK().ordinal()];
        if (i == 1) {
            i = this.intValue;
            Double ON = Ns().ON();
            this.intValue = i - (ON != null ? (int) ON.doubleValue() : 0);
            s(String.valueOf(this.intValue));
        } else if (i == 2) {
            BigDecimal subtract = this.aFV.subtract(this.aFW);
            kotlin.jvm.internal.i.e(subtract, "this.subtract(other)");
            subtract = subtract.stripTrailingZeros();
            kotlin.jvm.internal.i.e(subtract, "doubleValue.minus(doubleStep).stripTrailingZeros()");
            this.aFV = subtract;
            String toPlainString = this.aFV.toPlainString();
            kotlin.jvm.internal.i.e(toPlainString, "doubleValue.toPlainString()");
            s(toPlainString);
        }
    }
}
