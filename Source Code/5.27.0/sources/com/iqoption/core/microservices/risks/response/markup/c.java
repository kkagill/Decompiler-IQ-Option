package com.iqoption.core.microservices.risks.response.markup;

import com.google.gson.annotations.SerializedName;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkup;", "", "()V", "from", "", "to", "value", "", "(IID)V", "getFrom", "()I", "getTo", "getValue", "()D", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "core_release"})
/* compiled from: SpreadMarkup.kt */
public final class c {
    private static final c bys = new c();
    public static final a byt = new a();
    @SerializedName("from")
    private final int from;
    @SerializedName("to")
    private final int to;
    @SerializedName("value")
    private final double value;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkup$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkup;", "getEMPTY", "()Lcom/iqoption/core/microservices/risks/response/markup/SpreadMarkup;", "core_release"})
    /* compiled from: SpreadMarkup.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final c ahk() {
            return c.bys;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if ((this.from == cVar.from ? 1 : null) != null) {
                    if ((this.to == cVar.to ? 1 : null) == null || Double.compare(this.value, cVar.value) != 0) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = ((this.from * 31) + this.to) * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.value);
        return i + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpreadMarkup(from=");
        stringBuilder.append(this.from);
        stringBuilder.append(", to=");
        stringBuilder.append(this.to);
        stringBuilder.append(", value=");
        stringBuilder.append(this.value);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public c(int i, int i2, double d) {
        this.from = i;
        this.to = i2;
        this.value = d;
    }

    public final int ahh() {
        return this.from;
    }

    public final int ahi() {
        return this.to;
    }

    public /* synthetic */ c(int i, int i2, double d, int i3, f fVar) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            d = 0.0d;
        }
        this(i, i2, d);
    }

    public final double getValue() {
        return this.value;
    }

    public c() {
        this(0, 0, 0.0d, 6, null);
    }
}
