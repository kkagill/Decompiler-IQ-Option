package io.reactivex;

import io.reactivex.internal.a.b;
import io.reactivex.internal.util.NotificationLite;

/* compiled from: Notification */
public final class l<T> {
    static final l<Object> eQh = new l(null);
    final Object value;

    private l(Object obj) {
        this.value = obj;
    }

    public boolean blh() {
        return NotificationLite.isError(this.value);
    }

    public boolean bli() {
        Object obj = this.value;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public T getValue() {
        Object obj = this.value;
        return (obj == null || NotificationLite.isError(obj)) ? null : this.value;
    }

    public Throwable blj() {
        Object obj = this.value;
        return NotificationLite.isError(obj) ? NotificationLite.getError(obj) : null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return b.equals(this.value, ((l) obj).value);
    }

    public int hashCode() {
        Object obj = this.value;
        return obj != null ? obj.hashCode() : 0;
    }

    public String toString() {
        Object obj = this.value;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        String str = "]";
        if (NotificationLite.isError(obj)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("OnErrorNotification[");
            stringBuilder.append(NotificationLite.getError(obj));
            stringBuilder.append(str);
            return stringBuilder.toString();
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("OnNextNotification[");
        stringBuilder2.append(this.value);
        stringBuilder2.append(str);
        return stringBuilder2.toString();
    }
}
