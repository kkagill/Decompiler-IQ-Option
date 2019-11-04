package com.iqoption.charttools.constructor;

import com.iqoption.charttools.model.indicator.constructor.InputItem;
import com.iqoption.charttools.model.indicator.constructor.b;
import com.iqoption.charttools.n;
import com.iqoption.core.d;
import com.iqoption.core.ext.c;
import com.iqoption.dto.entity.position.Position;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005BI\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0007¢\u0006\u0002\u0010\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\nH\u0016R\u000e\u0010\u0012\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0017R\u0011\u0010\u0003\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, bng = {"Lcom/iqoption/charttools/constructor/InputHost;", "Lcom/iqoption/charttools/constructor/LabeledInput;", "item", "selected", "Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "(Lcom/iqoption/charttools/constructor/InputHost;Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;)V", "id", "", "gid", "input", "Lcom/iqoption/charttools/model/indicator/constructor/InputItem;", "default", "", "isEnabled", "", "hosts", "", "(IILcom/iqoption/charttools/model/indicator/constructor/InputItem;Ljava/lang/String;Z[Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;I)V", "defaultValue", "getHosts", "()[Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "[Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "isDefault", "()Z", "getSelected", "()I", "toDefault", "Lcom/iqoption/charttools/constructor/InputAdapterItem;", "toInput", "Companion", "techtools_release"})
/* compiled from: InputAdapterItems.kt */
public final class o extends z {
    private static final b aFw = new b(-1, d.getString(n.i.chart));
    public static final a aFx = new a();
    private final b[] aFv;
    private final int defaultValue;
    private final boolean isEnabled;
    private final int selected;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0002\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, bng = {"Lcom/iqoption/charttools/constructor/InputHost$Companion;", "", "()V", "CHART_FIGURE_HOST", "Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "getCHART_FIGURE_HOST", "()Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;", "findSelected", "", "hosts", "", "index", "([Lcom/iqoption/charttools/model/indicator/constructor/FigureHost;I)I", "techtools_release"})
    /* compiled from: InputAdapterItems.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b Nk() {
            return o.aFw;
        }

        private final int a(b[] bVarArr, int i) {
            int length = bVarArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                if ((bVarArr[i2].getIndex() == i ? 1 : null) != null) {
                    return i2;
                }
            }
            return -1;
        }
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public /* synthetic */ o(int i, int i2, InputItem inputItem, String str, boolean z, b[] bVarArr, int i3, int i4, f fVar) {
        boolean z2 = (i4 & 16) != 0 ? false : z;
        b[] bVarArr2 = (i4 & 32) != 0 ? new b[]{aFw} : bVarArr;
        this(i, i2, inputItem, str, z2, bVarArr2, (i4 & 64) != 0 ? aFx.a(bVarArr2, inputItem.getIntValue()) : i3);
    }

    public final b[] Ni() {
        return this.aFv;
    }

    public final int Nd() {
        return this.selected;
    }

    public o(int i, int i2, InputItem inputItem, String str, boolean z, b[] bVarArr, int i3) {
        String str2 = str;
        Object obj = bVarArr;
        InputItem inputItem2 = inputItem;
        kotlin.jvm.internal.i.f(inputItem, "input");
        kotlin.jvm.internal.i.f(str, Position.CLOSE_REASON_DEFAULT);
        kotlin.jvm.internal.i.f(obj, "hosts");
        super(i, i2, inputItem2, str, null, 16, null);
        this.isEnabled = z;
        this.aFv = obj;
        this.selected = i3;
        this.defaultValue = aFx.a(this.aFv, c.B(str2));
    }

    public o(o oVar, b bVar) {
        kotlin.jvm.internal.i.f(oVar, "item");
        kotlin.jvm.internal.i.f(bVar, "selected");
        int intValue = oVar.getId().intValue();
        int gid = oVar.getGid();
        InputItem Ns = oVar.Ns();
        String Nt = oVar.Nt();
        boolean z = oVar.isEnabled;
        b[] bVarArr = oVar.aFv;
        this(intValue, gid, Ns, Nt, z, bVarArr, aFx.a(bVarArr, bVar.getIndex()));
    }

    public boolean isDefault() {
        return this.defaultValue == this.selected;
    }

    public InputItem Na() {
        return InputItem.a(Ns(), null, null, String.valueOf(this.aFv[this.selected].getIndex()), null, null, null, null, false, 251, null);
    }

    public f Nb() {
        return new o(getId().intValue(), getGid(), Nr(), Nt(), this.isEnabled, this.aFv, 0, 64, null);
    }
}
