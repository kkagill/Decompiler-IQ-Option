package com.iqoption.core.microservices.techinstruments.a;

import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0007HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, bng = {"Lcom/iqoption/core/microservices/techinstruments/response/ModifiedTemplates;", "", "()V", "changed", "", "Lcom/iqoption/core/microservices/techinstruments/response/Template;", "removed", "", "(Ljava/util/List;[J)V", "getChanged", "()Ljava/util/List;", "getRemoved", "()[J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "core_release"})
/* compiled from: ModifiedTemplates.kt */
public final class c {
    @SerializedName("changed")
    private final List<e> aEe;
    @SerializedName("removed")
    private final long[] aEf;

    public c(List<e> list, long[] jArr) {
        kotlin.jvm.internal.i.f(list, "changed");
        kotlin.jvm.internal.i.f(jArr, "removed");
        this.aEe = list;
        this.aEf = jArr;
    }

    public /* synthetic */ c(List list, long[] jArr, int i, f fVar) {
        if ((i & 1) != 0) {
            list = m.emptyList();
        }
        if ((i & 2) != 0) {
            jArr = new long[0];
        }
        this(list, jArr);
    }

    public final List<e> Mx() {
        return this.aEe;
    }

    public final long[] My() {
        return this.aEf;
    }

    public c() {
        this(m.emptyList(), null, 2, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((kotlin.jvm.internal.i.y(getClass(), obj != null ? obj.getClass() : null) ^ 1) != 0) {
            return false;
        }
        if (obj != null) {
            c cVar = (c) obj;
            if ((kotlin.jvm.internal.i.y(this.aEe, cVar.aEe) ^ 1) == 0 && Arrays.equals(this.aEf, cVar.aEf)) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.microservices.techinstruments.response.ModifiedTemplates");
    }

    public int hashCode() {
        return (this.aEe.hashCode() * 31) + Arrays.hashCode(this.aEf);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ModifiedTemplates(changed=");
        stringBuilder.append(this.aEe);
        stringBuilder.append(", removed=");
        stringBuilder.append(Arrays.toString(this.aEf));
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}
