package com.iqoption.charttools.constructor;

import com.iqoption.charttools.model.indicator.constructor.InputItem;
import com.iqoption.core.ext.c;
import kotlin.i;
import kotlin.jvm.a.a;
import kotlin.l;

@i(bne = {1, 1, 15}, bnf = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B9\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\u0010\fJ\b\u0010\t\u001a\u00020\u000bH\u0004J\u0006\u0010\u001c\u001a\u00020\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u0001\u0006\u001d\u001e\u001f !\"¨\u0006#"}, bng = {"Lcom/iqoption/charttools/constructor/LabeledInput;", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "id", "", "gid", "input", "Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "default", "", "onChanged", "Lkotlin/Function0;", "", "(IILcom/iqoption/charttools/model/indicator/constructor/InputItem;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getDefault", "()Ljava/lang/String;", "getGid", "()I", "hasValue", "", "getHasValue", "()Z", "getInput", "()Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "isValid", "label", "getLabel", "getOnChanged", "()Lkotlin/jvm/functions/Function0;", "toDefaultInput", "Lcom/iqoption/charttools/constructor/InputBool;", "Lcom/iqoption/charttools/constructor/InputField;", "Lcom/iqoption/charttools/constructor/InputSelect;", "Lcom/iqoption/charttools/constructor/InputColor;", "Lcom/iqoption/charttools/constructor/InputLineWidth;", "Lcom/iqoption/charttools/constructor/InputHost;", "techtools_release"})
/* compiled from: InputAdapterItems.kt */
public abstract class z extends f {
    private final int aFZ;
    private final InputItem aGa;
    private final String aGb;
    private final a<l> aGc;

    public boolean MZ() {
        return true;
    }

    public boolean isValid() {
        return true;
    }

    public /* synthetic */ z(int i, int i2, InputItem inputItem, String str, a aVar, f fVar) {
        this(i, i2, inputItem, str, aVar);
    }

    public final int getGid() {
        return this.aFZ;
    }

    public final InputItem Ns() {
        return this.aGa;
    }

    public final String Nt() {
        return this.aGb;
    }

    /* synthetic */ z(int i, int i2, InputItem inputItem, String str, a aVar, int i3, f fVar) {
        if ((i3 & 16) != 0) {
            aVar = (a) null;
        }
        this(i, i2, inputItem, str, aVar);
    }

    public final a<l> Nu() {
        return this.aGc;
    }

    private z(int i, int i2, InputItem inputItem, String str, a<l> aVar) {
        super(i, null);
        this.aFZ = i2;
        this.aGa = inputItem;
        this.aGb = str;
        this.aGc = aVar;
    }

    public String getLabel() {
        return c.fU(this.aGa.getName());
    }

    public final InputItem Nr() {
        if ((kotlin.jvm.internal.i.y(this.aGb, this.aGa.getValue()) ^ 1) != 0) {
            return InputItem.a(this.aGa, null, null, this.aGb, null, null, null, null, false, 251, null);
        }
        return this.aGa;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onChanged() {
        a aVar = this.aGc;
        if (aVar != null) {
            l lVar = (l) aVar.invoke();
        }
    }
}
