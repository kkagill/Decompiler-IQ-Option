package io.reactivex;

import io.reactivex.disposables.b;

/* compiled from: Observer */
public interface n<T> {
    void d(b bVar);

    void onComplete();

    void onError(Throwable th);

    void onNext(T t);
}
