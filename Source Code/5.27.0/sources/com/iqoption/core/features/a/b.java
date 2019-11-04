package com.iqoption.core.features.a;

import com.google.gson.annotations.SerializedName;
import com.iqoption.core.util.o;
import java.util.List;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, bng = {"Lcom/iqoption/core/features/deal/LeveragesLimitParams;", "", "()V", "thresold", "", "instruments", "", "", "(ILjava/util/List;)V", "getInstruments", "()Ljava/util/List;", "getThresold", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "core_release"})
@o
/* compiled from: LeveragesLimitParams.kt */
public final class b {
    private static final b bho = new b();
    public static final a bhp = new a();
    @SerializedName("instruments")
    private final List<String> aKz;
    @SerializedName("hide_leverage_threshold")
    private final int bhn;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/features/deal/LeveragesLimitParams$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/features/deal/LeveragesLimitParams;", "getEMPTY", "()Lcom/iqoption/core/features/deal/LeveragesLimitParams;", "core_release"})
    /* compiled from: LeveragesLimitParams.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final b Xp() {
            return b.bho;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if ((this.bhn == bVar.bhn ? 1 : null) == null || !kotlin.jvm.internal.i.y(this.aKz, bVar.aKz)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.bhn * 31;
        List list = this.aKz;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LeveragesLimitParams(thresold=");
        stringBuilder.append(this.bhn);
        stringBuilder.append(", instruments=");
        stringBuilder.append(this.aKz);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public b(int i, List<String> list) {
        kotlin.jvm.internal.i.f(list, "instruments");
        this.bhn = i;
        this.aKz = list;
    }

    public final int Xn() {
        return this.bhn;
    }

    public /* synthetic */ b(int i, List list, int i2, f fVar) {
        if ((i2 & 1) != 0) {
            i = Integer.MAX_VALUE;
        }
        if ((i2 & 2) != 0) {
            list = m.emptyList();
        }
        this(i, list);
    }

    public final List<String> Pe() {
        return this.aKz;
    }

    public b() {
        this(0, null, 2, null);
    }
}
