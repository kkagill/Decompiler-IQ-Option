package com.iqoption.core.data.model.aud;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0018B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004HÆ\u0003J\u0015\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004HÆ\u0003J5\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\fR\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t¨\u0006\u0019"}, bng = {"Lcom/iqoption/core/data/model/aud/AudListState;", "T", "", "dataList", "", "lastConsumed", "Lcom/iqoption/core/data/model/aud/AudEvent;", "(Ljava/util/List;Ljava/util/List;)V", "getDataList", "()Ljava/util/List;", "isEmpty", "", "()Z", "isNotEmpty", "getLastConsumed", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "core_release"})
/* compiled from: AudListState.kt */
public final class a<T> {
    private static final a<Object> bdd = new a(m.emptyList(), null, 2, null);
    public static final a bde = new a();
    private final List<T> bdb;
    private final List<AudEvent<T>> bdc;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0004\"\u0004\b\u0001\u0010\u0006H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, bng = {"Lcom/iqoption/core/data/model/aud/AudListState$Companion;", "", "()V", "EMPTY", "Lcom/iqoption/core/data/model/aud/AudListState;", "empty", "T", "core_release"})
    /* compiled from: AudListState.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final <T> a<T> VX() {
            a VW = a.bdd;
            if (VW != null) {
                return VW;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.iqoption.core.data.model.aud.AudListState<T>");
        }
    }

    public static /* synthetic */ a a(a aVar, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aVar.bdb;
        }
        if ((i & 2) != 0) {
            list2 = aVar.bdc;
        }
        return aVar.g(list, list2);
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bdc, r3.bdc) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.data.model.aud.a;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.data.model.aud.a) r3;
        r0 = r2.bdb;
        r1 = r3.bdb;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.bdc;
        r3 = r3.bdc;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x001d;
    L_0x001c:
        goto L_0x001f;
    L_0x001d:
        r3 = 0;
        return r3;
    L_0x001f:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.data.model.aud.a.equals(java.lang.Object):boolean");
    }

    public final a<T> g(List<? extends T> list, List<AudEvent<T>> list2) {
        kotlin.jvm.internal.i.f(list, "dataList");
        kotlin.jvm.internal.i.f(list2, "lastConsumed");
        return new a(list, list2);
    }

    public int hashCode() {
        List list = this.bdb;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List list2 = this.bdc;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudListState(dataList=");
        stringBuilder.append(this.bdb);
        stringBuilder.append(", lastConsumed=");
        stringBuilder.append(this.bdc);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public a(List<? extends T> list, List<AudEvent<T>> list2) {
        kotlin.jvm.internal.i.f(list, "dataList");
        kotlin.jvm.internal.i.f(list2, "lastConsumed");
        this.bdb = list;
        this.bdc = list2;
    }

    public final List<T> VV() {
        return this.bdb;
    }

    public /* synthetic */ a(List list, List list2, int i, f fVar) {
        if ((i & 2) != 0) {
            list2 = m.emptyList();
        }
        this(list, list2);
    }

    public final boolean VU() {
        return ((a) this) != bdd;
    }
}
