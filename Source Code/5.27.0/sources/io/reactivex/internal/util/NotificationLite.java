package io.reactivex.internal.util;

import io.reactivex.disposables.b;
import io.reactivex.n;
import java.io.Serializable;
import org.a.c;
import org.a.d;

public enum NotificationLite {
    COMPLETE;

    static final class DisposableNotification implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;
        final b upstream;

        DisposableNotification(b bVar) {
            this.upstream = bVar;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NotificationLite.Disposable[");
            stringBuilder.append(this.upstream);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    static final class ErrorNotification implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;
        final Throwable e;

        ErrorNotification(Throwable th) {
            this.e = th;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NotificationLite.Error[");
            stringBuilder.append(this.e);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ErrorNotification)) {
                return false;
            }
            return io.reactivex.internal.a.b.equals(this.e, ((ErrorNotification) obj).e);
        }
    }

    static final class SubscriptionNotification implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;
        final d upstream;

        SubscriptionNotification(d dVar) {
            this.upstream = dVar;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("NotificationLite.Subscription[");
            stringBuilder.append(this.upstream);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public String toString() {
        return "NotificationLite.Complete";
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static Object error(Throwable th) {
        return new ErrorNotification(th);
    }

    public static Object subscription(d dVar) {
        return new SubscriptionNotification(dVar);
    }

    public static Object disposable(b bVar) {
        return new DisposableNotification(bVar);
    }

    public static boolean isComplete(Object obj) {
        return obj == COMPLETE;
    }

    public static boolean isError(Object obj) {
        return obj instanceof ErrorNotification;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof SubscriptionNotification;
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof DisposableNotification;
    }

    public static Throwable getError(Object obj) {
        return ((ErrorNotification) obj).e;
    }

    public static d getSubscription(Object obj) {
        return ((SubscriptionNotification) obj).upstream;
    }

    public static b getDisposable(Object obj) {
        return ((DisposableNotification) obj).upstream;
    }

    public static <T> boolean accept(Object obj, c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            cVar.onError(((ErrorNotification) obj).e);
            return true;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean accept(Object obj, n<? super T> nVar) {
        if (obj == COMPLETE) {
            nVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            nVar.onError(((ErrorNotification) obj).e);
            return true;
        } else {
            nVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            cVar.onError(((ErrorNotification) obj).e);
            return true;
        } else if (obj instanceof SubscriptionNotification) {
            cVar.onSubscribe(((SubscriptionNotification) obj).upstream);
            return false;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, n<? super T> nVar) {
        if (obj == COMPLETE) {
            nVar.onComplete();
            return true;
        } else if (obj instanceof ErrorNotification) {
            nVar.onError(((ErrorNotification) obj).e);
            return true;
        } else if (obj instanceof DisposableNotification) {
            nVar.d(((DisposableNotification) obj).upstream);
            return false;
        } else {
            nVar.onNext(obj);
            return false;
        }
    }
}
