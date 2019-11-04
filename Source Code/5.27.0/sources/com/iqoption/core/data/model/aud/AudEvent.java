package com.iqoption.core.data.model.aud;

import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\b\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u001b\u001cB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00160\u0000\"\u0004\b\u0001\u0010\u00162\u0006\u0010\u0017\u001a\u0002H\u0016¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, bng = {"Lcom/iqoption/core/data/model/aud/AudEvent;", "T", "", "type", "Lcom/iqoption/core/data/model/aud/AudEvent$Type;", "data", "(Lcom/iqoption/core/data/model/aud/AudEvent$Type;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getType", "()Lcom/iqoption/core/data/model/aud/AudEvent$Type;", "component1", "component2", "copy", "(Lcom/iqoption/core/data/model/aud/AudEvent$Type;Ljava/lang/Object;)Lcom/iqoption/core/data/model/aud/AudEvent;", "equals", "", "other", "hashCode", "", "setData", "R", "newData", "(Ljava/lang/Object;)Lcom/iqoption/core/data/model/aud/AudEvent;", "toString", "", "Companion", "Type", "core_release"})
/* compiled from: AudEvent.kt */
public final class AudEvent<T> {
    public static final a bda = new a();
    private final Type bcZ;
    private final T data;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, bng = {"Lcom/iqoption/core/data/model/aud/AudEvent$Type;", "", "(Ljava/lang/String;I)V", "ADD", "UPDATE", "DELETE", "core_release"})
    /* compiled from: AudEvent.kt */
    public enum Type {
        ADD,
        UPDATE,
        DELETE
    }

    @i(bne = {1, 1, 15}, bnf = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005H\u0007¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005H\u0007¢\u0006\u0002\u0010\u0007J!\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0006\u001a\u0002H\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\n"}, bng = {"Lcom/iqoption/core/data/model/aud/AudEvent$Companion;", "", "()V", "add", "Lcom/iqoption/core/data/model/aud/AudEvent;", "T", "data", "(Ljava/lang/Object;)Lcom/iqoption/core/data/model/aud/AudEvent;", "delete", "update", "core_release"})
    /* compiled from: AudEvent.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public final <T> AudEvent<T> bF(T t) {
            return new AudEvent(Type.ADD, t);
        }

        public final <T> AudEvent<T> bG(T t) {
            return new AudEvent(Type.UPDATE, t);
        }

        public final <T> AudEvent<T> bH(T t) {
            return new AudEvent(Type.DELETE, t);
        }
    }

    /* JADX WARNING: Missing block: B:6:0x001a, code skipped:
            if (kotlin.jvm.internal.i.y(r2.data, r3.data) != false) goto L_0x001f;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x001f;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.data.model.aud.AudEvent;
        if (r0 == 0) goto L_0x001d;
    L_0x0006:
        r3 = (com.iqoption.core.data.model.aud.AudEvent) r3;
        r0 = r2.bcZ;
        r1 = r3.bcZ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x001d;
    L_0x0012:
        r0 = r2.data;
        r3 = r3.data;
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
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.data.model.aud.AudEvent.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Type type = this.bcZ;
        int i = 0;
        int hashCode = (type != null ? type.hashCode() : 0) * 31;
        Object obj = this.data;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudEvent(type=");
        stringBuilder.append(this.bcZ);
        stringBuilder.append(", data=");
        stringBuilder.append(this.data);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public AudEvent(Type type, T t) {
        kotlin.jvm.internal.i.f(type, "type");
        this.bcZ = type;
        this.data = t;
    }
}
