package com.iqoption.charttools.constructor;

import com.iqoption.charttools.model.indicator.constructor.InputItem;
import com.iqoption.core.ext.c;
import com.iqoption.dto.entity.position.Position;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B?\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u000eJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016R\u000e\u0010\u000f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, bng = {"Lcom/iqoption/charttools/constructor/InputSelect;", "Lcom/iqoption/charttools/constructor/LabeledInput;", "item", "selected", "", "(Lcom/iqoption/charttools/constructor/InputSelect;I)V", "id", "gid", "input", "Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "default", "", "options", "", "(IILcom/iqoption/charttools/model/indicator/constructor/InputItem;Ljava/lang/String;[Ljava/lang/String;I)V", "defaultValue", "isDefault", "", "()Z", "getOptions", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getSelected", "()I", "toDefault", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "toInput", "techtools_release"})
/* compiled from: InputAdapterItems.kt */
public final class u extends z {
    private final String[] aFM;
    private final int defaultValue;
    private final int selected;

    public /* synthetic */ u(int i, int i2, InputItem inputItem, String str, String[] strArr, int i3, int i4, f fVar) {
        String[] strArr2;
        if ((i4 & 16) != 0) {
            String[] Nm = inputItem.Nm();
            if (Nm == null) {
                kotlin.jvm.internal.i.bnJ();
            }
            String[] strArr3 = new String[Nm.length];
            int length = strArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                strArr3[i5] = c.fU(Nm[i5]);
            }
            strArr2 = strArr3;
        } else {
            strArr2 = strArr;
        }
        this(i, i2, inputItem, str, strArr2, (i4 & 32) != 0 ? inputItem.getIntValue() : i3);
    }

    public final String[] Nm() {
        return this.aFM;
    }

    public final int Nd() {
        return this.selected;
    }

    public u(int i, int i2, InputItem inputItem, String str, String[] strArr, int i3) {
        kotlin.jvm.internal.i.f(inputItem, "input");
        kotlin.jvm.internal.i.f(str, Position.CLOSE_REASON_DEFAULT);
        kotlin.jvm.internal.i.f(strArr, "options");
        super(i, i2, inputItem, str, null, 16, null);
        this.aFM = strArr;
        this.selected = i3;
        this.defaultValue = c.B(str);
    }

    public u(u uVar, int i) {
        kotlin.jvm.internal.i.f(uVar, "item");
        this(uVar.getId().intValue(), uVar.getGid(), uVar.Ns(), uVar.Nt(), null, i, 16, null);
    }

    public boolean isDefault() {
        return this.defaultValue == this.selected;
    }

    public InputItem Na() {
        return InputItem.a(Ns(), null, null, String.valueOf(this.selected), null, null, null, null, false, 251, null);
    }

    public f Nb() {
        return new u(getId().intValue(), getGid(), Nr(), Nt(), null, 0, 48, null);
    }
}
