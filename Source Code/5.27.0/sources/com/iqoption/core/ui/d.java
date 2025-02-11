package com.iqoption.core.ui;

import androidx.core.app.NotificationCompat;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001$B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003JB\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\u0017\u0010\u001d\u001a\u00028\u00002\b\b\u0001\u0010\u001e\u001a\u00028\u0000H\u0007¢\u0006\u0002\u0010\u001fJ\t\u0010 \u001a\u00020!HÖ\u0001J\u0006\u0010\"\u001a\u00020\u001bJ\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006%"}, bng = {"Lcom/iqoption/core/ui/Resource;", "T", "", "status", "Lcom/iqoption/core/ui/Status;", "data", "message", "", "throwable", "", "(Lcom/iqoption/core/ui/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lcom/iqoption/core/ui/Status;", "getThrowable", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "(Lcom/iqoption/core/ui/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/iqoption/core/ui/Resource;", "equals", "", "other", "getDataIfSuccess", "default", "(Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "", "isSuccess", "toString", "Companion", "core_release"})
/* compiled from: Resource.kt */
public final class d<T> {
    public static final a bHb = new a();
    private final Status bGZ;
    private final Throwable bHa;
    private final T data;
    private final String message;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\u000bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\r¨\u0006\u000f"}, bng = {"Lcom/iqoption/core/ui/Resource$Companion;", "", "()V", "error", "Lcom/iqoption/core/ui/Resource;", "T", "throwable", "", "message", "", "data", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;)Lcom/iqoption/core/ui/Resource;", "loading", "(Ljava/lang/Object;)Lcom/iqoption/core/ui/Resource;", "success", "core_release"})
    /* compiled from: Resource.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public static /* synthetic */ d a(a aVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return aVar.bS(obj);
        }

        public final <T> d<T> bS(T t) {
            return new d(Status.SUCCESS, t, null, null, 8, null);
        }

        public static /* synthetic */ d a(a aVar, Throwable th, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                th = (Throwable) null;
            }
            if ((i & 2) != 0) {
                str = (String) null;
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            return aVar.a(th, str, obj);
        }

        public final <T> d<T> a(Throwable th, String str, T t) {
            Status status = Status.ERROR;
            if (str == null) {
                str = th != null ? th.getMessage() : null;
            }
            return new d(status, t, str, th);
        }

        public static /* synthetic */ d b(a aVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return aVar.bT(obj);
        }

        public final <T> d<T> bT(T t) {
            return new d(Status.LOADING, t, null, null, 8, null);
        }
    }

    /* JADX WARNING: Missing block: B:10:0x002e, code skipped:
            if (kotlin.jvm.internal.i.y(r2.bHa, r3.bHa) != false) goto L_0x0033;
     */
    public boolean equals(java.lang.Object r3) {
        /*
        r2 = this;
        if (r2 == r3) goto L_0x0033;
    L_0x0002:
        r0 = r3 instanceof com.iqoption.core.ui.d;
        if (r0 == 0) goto L_0x0031;
    L_0x0006:
        r3 = (com.iqoption.core.ui.d) r3;
        r0 = r2.bGZ;
        r1 = r3.bGZ;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0012:
        r0 = r2.data;
        r1 = r3.data;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x001c:
        r0 = r2.message;
        r1 = r3.message;
        r0 = kotlin.jvm.internal.i.y(r0, r1);
        if (r0 == 0) goto L_0x0031;
    L_0x0026:
        r0 = r2.bHa;
        r3 = r3.bHa;
        r3 = kotlin.jvm.internal.i.y(r0, r3);
        if (r3 == 0) goto L_0x0031;
    L_0x0030:
        goto L_0x0033;
    L_0x0031:
        r3 = 0;
        return r3;
    L_0x0033:
        r3 = 1;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iqoption.core.ui.d.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Status status = this.bGZ;
        int i = 0;
        int hashCode = (status != null ? status.hashCode() : 0) * 31;
        Object obj = this.data;
        hashCode = (hashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        String str = this.message;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Throwable th = this.bHa;
        if (th != null) {
            i = th.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Resource(status=");
        stringBuilder.append(this.bGZ);
        stringBuilder.append(", data=");
        stringBuilder.append(this.data);
        stringBuilder.append(", message=");
        stringBuilder.append(this.message);
        stringBuilder.append(", throwable=");
        stringBuilder.append(this.bHa);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public d(Status status, T t, String str, Throwable th) {
        kotlin.jvm.internal.i.f(status, NotificationCompat.CATEGORY_STATUS);
        this.bGZ = status;
        this.data = t;
        this.message = str;
        this.bHa = th;
    }

    public /* synthetic */ d(Status status, Object obj, String str, Throwable th, int i, f fVar) {
        if ((i & 2) != 0) {
            obj = null;
        }
        if ((i & 4) != 0) {
            str = (String) null;
        }
        if ((i & 8) != 0) {
            th = (Throwable) null;
        }
        this(status, obj, str, th);
    }

    public final Status akW() {
        return this.bGZ;
    }

    public final T getData() {
        return this.data;
    }

    public final Throwable getThrowable() {
        return this.bHa;
    }

    public final boolean isSuccess() {
        return this.bGZ == Status.SUCCESS;
    }
}
