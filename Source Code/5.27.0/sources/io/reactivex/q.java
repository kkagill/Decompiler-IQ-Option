package io.reactivex;

/* compiled from: SingleEmitter */
public interface q<T> {
    void onError(Throwable th);

    void onSuccess(T t);
}
