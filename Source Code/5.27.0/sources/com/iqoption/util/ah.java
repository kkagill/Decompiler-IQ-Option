package com.iqoption.util;

import androidx.core.app.NotificationCompat;
import kotlin.i;

@i(bne = {1, 1, 15}, bnf = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001a*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u001aB1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, bng = {"Lcom/iqoption/util/Resource;", "T", "", "status", "Lcom/iqoption/util/Status;", "data", "message", "", "throwable", "", "(Lcom/iqoption/util/Status;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Throwable;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lcom/iqoption/util/Status;", "getThrowable", "()Ljava/lang/Throwable;", "equals", "", "o", "hashCode", "", "toString", "Companion", "app_optionXRelease"})
/* compiled from: Resource.kt */
public final class ah<T> {
    public static final a ebV = new a();
    private final Throwable bHa;
    private final T data;
    private final Status ebU;
    private final String message;

    @i(bne = {1, 1, 15}, bnf = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J;\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\u000bJ#\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u0001H\u0005¢\u0006\u0002\u0010\r¨\u0006\u000f"}, bng = {"Lcom/iqoption/util/Resource$Companion;", "", "()V", "error", "Lcom/iqoption/util/Resource;", "T", "throwable", "", "message", "", "data", "(Ljava/lang/Throwable;Ljava/lang/String;Ljava/lang/Object;)Lcom/iqoption/util/Resource;", "loading", "(Ljava/lang/Object;)Lcom/iqoption/util/Resource;", "success", "app_optionXRelease"})
    /* compiled from: Resource.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(f fVar) {
            this();
        }

        public static /* synthetic */ ah a(a aVar, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            return aVar.cr(obj);
        }

        public final <T> ah<T> cr(T t) {
            return new ah(Status.SUCCESS, t, null, null, 8, null);
        }

        public static /* synthetic */ ah a(a aVar, Throwable th, String str, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                th = (Throwable) null;
            }
            if ((i & 2) != 0) {
                str = (String) null;
            }
            if ((i & 4) != 0) {
                obj = null;
            }
            return aVar.b(th, str, obj);
        }

        public final <T> ah<T> b(Throwable th, String str, T t) {
            return new ah(Status.ERROR, t, str, th);
        }
    }

    public ah(Status status, T t, String str, Throwable th) {
        kotlin.jvm.internal.i.f(status, NotificationCompat.CATEGORY_STATUS);
        this.ebU = status;
        this.data = t;
        this.message = str;
        this.bHa = th;
    }

    public /* synthetic */ ah(Status status, Object obj, String str, Throwable th, int i, f fVar) {
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

    public final Status aWW() {
        return this.ebU;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || (kotlin.jvm.internal.i.y(getClass(), obj.getClass()) ^ 1) != 0) {
            return false;
        }
        ah ahVar = (ah) obj;
        if (this.ebU != ahVar.ebU) {
            return false;
        }
        String str = this.message;
        int y = str != null ? kotlin.jvm.internal.i.y(str, ahVar.message) ^ 1 : ahVar.message != null ? 1 : 0;
        if (y != 0) {
            return false;
        }
        Object obj2 = this.data;
        if (obj2 != null) {
            z = kotlin.jvm.internal.i.y(obj2, ahVar.data);
        } else if (ahVar.data != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = this.ebU.hashCode() * 31;
        String str = this.message;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Object obj = this.data;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Resource{status=");
        stringBuilder.append(this.ebU);
        stringBuilder.append(", message='");
        stringBuilder.append(this.message);
        stringBuilder.append('\'');
        stringBuilder.append(", data=");
        stringBuilder.append(this.data);
        stringBuilder.append(", throwable=");
        stringBuilder.append(this.bHa);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
